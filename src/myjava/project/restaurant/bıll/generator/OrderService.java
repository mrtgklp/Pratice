package myjava.project.restaurant.bıll.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner input = new Scanner(System.in);
    List<Order> orderList = new ArrayList<>();//10000,100AdanaKebabı,2,220.00
    public void createOrder(DishService dishService){
        int dishCode =-1;
        while (dishCode!=0){
            System.out.println("Lütfen ürün kodu giriniz: (Cıkıs:0)");//100//500
            dishCode=input.nextInt();
            Dish dish = dishService.findByDishByCode(dishCode);//100,Adana kebabı,220 //bulamazsa 0,"",0
            if (dish.getCode()>0){
                System.out.println("Adet giriniz: ");
                int num = input.nextInt();//2
                Order order = new Order(dish,num);//Yeni siparis olusturacak
                order.setPrice();//Ucreti Hesapla ve orderPrice a ata
                order.setOrderCode(1000+orderList.size());//1000,1001
                this.orderList.add(order);
            }
            for (Order order:this.orderList
                 ) {
                System.out.printf("Siparis kodu:%-5s  lezzet kodu:%-3s   adı:%-20s  adet:%-2s\n",
                        order.orderCode,order.dish.getCode(),order.dish.getName(),order.numberOfDish);
            }

        }

    }
    public void deleteOrder(){
        boolean isValid = true;
        if (this.orderList.isEmpty()){
            System.out.println("Siparisiniz bulunmamaktadır..");
        }else {
            System.out.println("iptal etmek istediginiz siparisin kodunu giriniz: ");
            int code = input.nextInt();//1000
            for (Order siparis : this.orderList
                 ) {
                if (siparis.orderCode==code){
                    this.orderList.remove(siparis);
                    System.out.println("Siparisiniz iptal edildi..." + siparis.orderCode + "--" + siparis.dish.toString());
                    isValid=true;
                    break;
                }else{
                        isValid=false;
                }
            }
            if (!isValid){
                System.out.println("Siparis kodu geçersiz!");
            }
        }
    }
    public void printBıll(){
        double totalPrice=0.0;
        System.out.println("        Lezzet Fişiniz        ");
        for (Order order:this.orderList){
            System.out.printf("Lezzet kodu:%-5s Adı:%-20s Adet:%-5s Siparis tutarı:%-5s Lira\n",
                    order.dish.getCode(),order.dish.getName(),order.numberOfDish,order.orderPrice);
            totalPrice+=order.orderPrice;
        }
        System.out.println("Toplam tutar: " + totalPrice+" Lira");
        System.out.println("***Afiyet olsun***");
        this.orderList=new ArrayList<>();
    }
}
