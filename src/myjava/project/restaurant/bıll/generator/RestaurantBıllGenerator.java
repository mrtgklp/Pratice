package myjava.project.restaurant.bıll.generator;
 /*
    Proje: Restaurant Fıs Uretme Uygulaması(BıllGenerator)
    1.Bir restaurant online siparis sisteminde hesabı yazdıran uygulama tasarlayınız.
    2.Restaurant yiyecekler bir listte tutulsun.
      yiyeceklerin kodu,ismi ve ucreti olsun.
    3.Yıyecek menusu ,siparis oluşturma/iptal ve hesap
      olusturma için secim menusu gosterilsin.
    4.Yıyecek menu:Listedeki yıyecekler menu seklinde listelensin.
    siparis girme:yıyecegin kodu ve istenilen adet girilerek siparis olusturulsun
                  Her siparis için kod uretilsin(basşangıc 1000 artarak devam eder)
                  Her bır yıyecek sıparısı için  tutar hesaplansın
     Siparıs iptal:Sıparıs kodu gırılerek sıparıs sılınsın
     Hesap olusturma: Tutarları ile birlikte tum siparısleri ve toplam
                      tutarı gösteren ve hesap fisi yazdırılsın
  */

import java.util.Scanner;

public class RestaurantBıllGenerator {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        DishService dishService = new DishService();
        dishService.fıllDıshList();
        OrderService orderService = new OrderService();
        getSelectionMenu(dishService,orderService);

    }
    public static void getSelectionMenu(DishService dishService,OrderService orderService){
        int select=-1;
        while (select!=0){
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------------------------------");
            System.out.println("****Lezzet Restaurant Siparis Uygulaması***");
            System.out.print("1.Menu\n2.Siparis gir\n3.Siparis iptal etme\n4Hesap olustur\n0-Cıkıs\nSeciminiz:");
            select = input.nextInt();
            System.out.println("-------------------------------------------");
            switch (select){
                case 1:
                    dishService.showDishMenu();
                    break;
                case 2:
                    orderService.createOrder(dishService);
                    break;
                case 3:
                    orderService.deleteOrder();
                    break;
                case 4:
                    orderService.printBıll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giris");
                    break;
            }
        }
        System.out.println("iyi günler...");
    }
}

