package myjava.project.loginuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> userNameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("====TECHPROEDUCATION====");
        System.out.println("1-Üye ol");
        System.out.println("2-Giriş yap");
        System.out.println("3-Çıkış");
        System.out.println("Seçiminiz: ");
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-soyad: ");
        String name = scanner.nextLine();
        String userName;
        boolean existUserName;
        do {
            System.out.println("Kullanıcı adını giriniz: ");
            userName = scanner.nextLine();
            existUserName = userNameList.contains(userName);
            if (existUserName) {
                System.out.println("Bu username daha once kullanılmıştır. Yeni bir username deneyiniz.");
            }

        } while (existUserName);
        String email;
        boolean existEmail;
        boolean  isValid;;

        do {
            System.out.println("Email giriniz: ");
            email = scanner.nextLine().trim();//trim() bosluk siler
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);
            if (existEmail) {
                System.out.println("Bu email daha once kullanılmıstır . Yeni bir email deneyiniz.");
                isValid = false;
            }
        } while (!isValid);

        String password;
        boolean isValidPsw;
        do {
            System.out.println("Sifre giriniz:");
            password = scanner.nextLine().trim();
            isValidPsw = validPassword(password);
        } while (!isValidPsw);

        User user = new User(name, userName, email, password);
        System.out.println(user);
        userNameList.add(userName);
        emailList.add(email);
        passwordList.add(password);

        System.out.println("Tebrikler kayıt islemeniz gerceklesmistir");
        System.out.println("kullanıcı adı veya email ve sifre ile sisteme giris yapabilirsiniz");

    }//register()

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı veya email giriniz");
        String userNameOrEmail = scanner.nextLine();
        boolean isEmail = emailList.contains(userNameOrEmail);
        boolean isUserName = userNameList.contains(userNameOrEmail);

        if (isEmail || isUserName) {
            while (true) {
                System.out.println("Sifrenizi giriniz");
                String password = scanner.nextLine();


                int idx;
                if (isUserName) {
                    idx = userNameList.indexOf(userNameOrEmail);

                } else {
                    idx = emailList.indexOf(userNameOrEmail);
                }
                if (passwordList.get(idx).equals(password)) {
                    System.out.println("Sisteme Giris yaptınız");
                    break;
                } else {
                    System.out.println("Sifreniz yanlıs.Tekrar deneyiniz");
                }

            }
        }else {
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadi");
            System.out.println("Bilgileri kontrol ediniz yada uye olunuz");
        }
    }

    public static boolean validateEmail(String email) {
        boolean isValid;
        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Email bosluk iceremez");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email '@' içermelidir");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];
            boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").length() == 0;
            boolean checkEnd = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");

            if (!checkStart) {
                System.out.println("Email kucuk harf, buyuk harf, rakam ve _.- dısında karakter içeremez");
            } else if (!checkEnd) {
                System.out.println("Email gmail.com,yahoo.com ve hotmail.com ile bitmeli");
            }
            isValid = checkStart && checkEnd;

        }
        return isValid;
    }//validateEmail

    public static boolean validPassword(String password) {
        boolean isValidPwd;
        boolean space = password.contains(" ");
        boolean lenghtGt6 = password.length()>= 6;
        boolean exitUpper = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean exitLower = password.replaceAll("[^a-z]", "").length() > 0;
        boolean exitDigit = password.replaceAll("[\\D]", "").length() > 0;
        boolean exitSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;

        if (space) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lenghtGt6) {
            System.out.println("Sifre en az 6 karakter icermelidir");
        } else if (!exitUpper) {
            System.out.println("Sifre en az 1 tane buyuk harf ıcermelidir");
        } else if (!exitLower) {
            System.out.println("Sifre en az 1 tane kucuk harf icermelidir");
        } else if (!exitDigit) {
            System.out.println("Sifre en az 1 tane sayı icermelidir");
        } else if (!exitSymbol) {
            System.out.println("Sifre en az 1 tane sembol icermelidir");
        }
        isValidPwd = !space && lenghtGt6 && exitDigit && exitLower && exitUpper && exitSymbol;
        if (!isValidPwd) {
            System.out.println("Tekrar deneyiniz");
        }
        return isValidPwd;

    }

}
