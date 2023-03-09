package greatlearning;

import java.util.Scanner;

public class StringManupulation {
    public static void main(String[] args) {
        /*
            lenght
            contains
            charAt
            toUpperCase
            subString
            trim
            split
            isBlank
            isEmpty
            indexOf
            lastIndexOf
            replace
            replaceeAll
            equals
            equalsIgnoreCase
            valueOf
            stratsWith
            endWith
            concat
         */
        //soru:1) Girilen iki String veriyi karşılaştıran java kodu yazınız
        String str1 = "ali";
        String str2 = "ali";
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));

        /*Soru2: Kullanıcıdan email adresini girmesini isteyin,
                mail @gmail.com icermiyorsa 1Lütfen gmail. adresi giriniz".
                @gmail.com ile bitiyorsa "Email adresiniz kaydedildi."
                @gmail.com ile bitmiyorsa lütfen yazımı kontrol edin yazınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen email adresini giriniz:");
        String email = input.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lütfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else if (email.contains(" ")) {
            System.out.println("Lütfen bosluksuz bir deger giriniz");

        } else {
            System.out.println("Lütfen yazımı kontrol ediniz");
        }
        
        /*
        Soru3: Cumle "buyuk" kelimes içeriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi içeriyorsa tum cumleyi kucuk harf olarak yazdırın
        iki kelimeyi de içermiyorsa "Cumle kucuk yada buyuk kelimesi içermiyor"
        iki kelimeyi de içeriyorsa karar ver buyuk mu yazdırayım , kucuk mu? yazdırın.
        
        
        
         */
        String cumle ="Java Buyuk,Dunya Kucu";
        cumle=cumle.toLowerCase();
        if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
            System.out.println("Cumle kucuk ya da buyuk kelimesi içermiyor");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")){
                System.out.println(cumle.toUpperCase());
            }

        else{
            System.out.println("Karar ver buyuk mu yazdırayım,kucuk mu");
        }

        /*
        Soru 4: Kişi isimleri için 3 String degişken oluşturunuz.
        Boşluk karakterleri haric 3 isimdeki
        karakter sayısının toplamını yazdırınız
         */
        String isim = "   Ahmet Can    ";
        String isim3 = "   Ali Can    ";
        String isim4 = "   Mahmut Can    ";
        int c1 = isim.replace(" ","").length();
        int c2 = isim3.replaceAll("\\s","").length();
        int c3 = isim4.replaceAll("\\s","").length();
        System.out.println("Karakter sayıların toplamı : " + (c1+c2+c3));
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son karakteri yazdırın
         */
        String s = "Ali can ";
        int boslukOlmayanInx = s.trim().length()-1;
        System.out.println(s.charAt(boslukOlmayanInx));
        System.out.println(s.substring(boslukOlmayanInx,boslukOlmayanInx + 1));


    }
}
