package myjava.project.busticket;

import java.util.Scanner;

public class BusTicket {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int km=0;
        int yas=0;
        int yolculukTipi=1;
        String plakaNumarası = "34 MG 34";

        System.out.println("Lütfen gidecegiz mesafeyi km olarak veririniz");
        km = input.nextInt();
        System.out.println("Lütfen yasınız giriniz");
        yas = input.nextInt();
        System.out.println("gidis ve ya donus tipini giriniz. sadece gidis yönü 1\nGidis-Donus ise 2");
        yolculukTipi = input.nextInt();


        if (km>0 && yas > 0 && (yolculukTipi==1 || yolculukTipi==2)){
            double biletUcreti = km*0.10;
            double yasIndırımOranı=0;
            if (yas<12){
                yasIndırımOranı=0.5;
            }else if (yas<24){
                yasIndırımOranı=0.1;
            }else if (yas>65){
                yasIndırımOranı=0.3;
            }
               biletUcreti-= biletUcreti*yasIndırımOranı;
            if (yolculukTipi==2){
               biletUcreti-= biletUcreti*0.2;
               biletUcreti*=2;
            }
            biletDokum(plakaNumarası,km,yolculukTipi,biletUcreti);

        }else {
            System.out.println("Hatalı Veri Girdiniz........");
        }
    }

    private static void biletDokum(String plakaNumarası, int km, int yolculukTipi,double biletUcreti) {
        System.out.println("=====================Bilet Dokum========================");
        System.out.println("Otobusun Plakası : " + plakaNumarası);
        System.out.println("Mesafe  : " + km);
        System.out.println("Yolculuk Tipi : " + (yolculukTipi==1 ? "Tek Yön":"Gidis-Donus Yönü : "));
        System.out.println("Bilet ücreti: " + biletUcreti);
        slowPrint("..... Keyifli Yolculuklar Dileriz.....",50);
    }
    public static void slowPrint(String text,int delay){
        for (char c:text.toCharArray()
        ) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
