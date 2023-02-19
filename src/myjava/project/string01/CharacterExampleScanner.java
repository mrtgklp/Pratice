package myjava.project.string01;

import java.util.Scanner;

public class CharacterExampleScanner {
    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana “Buyuk Harf” yazdiran
        //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir Harf Giriniz..");
        char ch = input.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Büyük Harf..");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk Harf...");
        }else {
            System.out.println("Girdiğiniz Harf Degildir..");
        }
        System.out.println("**********************************");

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        System.out.println("Lütfen Bir Sayı giriniz sayı Tek mı Cıft mı kontrol ediniz");
           int sayı = input.nextInt();
            if (sayı%2==0){
                System.out.println("Sayı cift sayıdır");
            } else if (sayı%2!=0) {
                System.out.println("Sayı tek sayıdır...");
            }
        System.out.println("=====================================");
        //Example 3: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        System.out.println("Lütfen bir sayı giriniz ve sayı pozitif veya negatif veya nötr mü? ");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Sayı pozitiftir");
        } else if (num<0) {
            System.out.println("Sayı negatiftir..");
        } else  {
            System.out.println("Sayı nötrtür");
        }
        System.out.println("-----------------------------------------------");
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

        System.out.println("Lütfen Bir gün sayısı giriniz");
        int days = input.nextInt();

        if (days==1){
            System.out.println("Pazar");
        } else if (days==2) {
            System.out.println("Pazartesi");
        } else if (days==3) {
            System.out.println("Salı");
        } else if (days==4) {
            System.out.println("Carsamba");
        } else if (days==5) {
            System.out.println("Persembe");
        }else if (days==6){
            System.out.println("Cuma");
        } else if (days==7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Gecerli bir güne baglı sayı giriniz");
        }
        System.out.println("??????????????????????????????????????????????????");
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        System.out.println("Please entry a month name..");
        String months = input.next();

        if (months.equalsIgnoreCase("January")){
            System.out.println("1");
        } else if (months.equalsIgnoreCase("February")) {
            System.out.println("2");
        } else if (months.equalsIgnoreCase("March")) {
            System.out.println("3");
        } else if (months.equalsIgnoreCase("April")) {
            System.out.println("4");
        } else if (months.equalsIgnoreCase("May")) {
            System.out.println("5");
        } else if (months.equalsIgnoreCase("June")) {
            System.out.println("6");
        } else if (months.equalsIgnoreCase("July")) {
            System.out.println("7");
        } else if (months.equalsIgnoreCase("Augost")) {
            System.out.println("8");
        } else if (months.equalsIgnoreCase("September")) {
            System.out.println("9");
        } else if (months.equalsIgnoreCase("Octomber")) {
            System.out.println("10");
        } else if (months.equalsIgnoreCase("November")) {
            System.out.println("11");
        } else if (months.equalsIgnoreCase("December")) {
            System.out.println("12");
        }else {
            System.out.println("Ivalid mobths name....");
        }
    }
}
