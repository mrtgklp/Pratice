package myjava.project.string01;

import java.util.Scanner;

public class IfYasDegeri {
    public static void main(String[] args) {
         /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir yas giriniz..");
        int age = input.nextInt();
        if (age<5){
            System.out.println("Bebek");
        }else if (age<=13){
            System.out.println("Cocuk");
        }else if (age<21){
            System.out.println("Genc..");
        }else if (age<31){
            System.out.println("Yetişkin..");
        }else if (age >30){
            System.out.println("Tanımlanmamıs...");
        }else {
            System.out.println("Lütfen gecerli bir yas giriniz...");
        }
    }
}
