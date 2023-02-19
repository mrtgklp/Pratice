package myjava.project.string01;

import java.util.Scanner;

public class AllCharacter {
   /* Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
    i)En az 8 character olsun
    ii)Space characteri password'de olmasin
    iii)En az bir tane buyuk harf olsun
    iv)En az bir tane kucuk harf olsun
    v)En az bir tane sembol olsun
    vi)En az bir tane rakam olsun

    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen Sifrenizi Giriniz...");
       String pwd = input.nextLine();
       boolean first  = pwd.length()>7;
       boolean  scond = !pwd.contains(" ");
       boolean thirt = pwd.replaceAll("[^A-Z]","").length()>0;
       boolean four = pwd.replaceAll("[^a-z]","").length()>0;
       boolean five = pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
       boolean six = pwd.replaceAll("[^0-9]","").length()>0;
       boolean password =  (first && scond && thirt && four && five && six);
       System.out.println("password = " + password);
   }
}
