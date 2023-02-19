package myjava.project.restaurant.bıll.generator;

import java.util.ArrayList;
import java.util.List;

public class DishService {
    List<Dish> dishList = new ArrayList<>();

    public void fıllDıshList(){
        Dish dishi1 = new Dish(100,"Adana Kebabı",220.00);
        Dish dishi2 = new Dish(101,"İskender",280.00);
        Dish dishi3 = new Dish(102,"Ali Nazik",420.00);
        Dish dishi4 = new Dish(103,"Vali Kebabı",590.00);
        Dish dishi5 = new Dish(104,"Kuzu Kebabı",790.00);
        Dish dishi6 = new Dish(105,"Ayran",30.00);
        Dish dishi7 = new Dish(106,"Kunefe",90.00);
        Dish dishi8 = new Dish(107,"Su",10.00);
        Dish dishi9 = new Dish(108,"Kola",35.00);
        Dish dishi10 = new Dish(109,"İcliKofte",190.00);
        this.dishList.add(dishi1);
        this.dishList.add(dishi2);
        this.dishList.add(dishi3);
        this.dishList.add(dishi4);
        this.dishList.add(dishi5);
        this.dishList.add(dishi6);
        this.dishList.add(dishi7);
        this.dishList.add(dishi8);
        this.dishList.add(dishi9);
        this.dishList.add(dishi10);

    }

    public void showDishMenu(){
        System.out.println("Lezzetlerimiz");
        System.out.printf(" %-3s   %-20s   %-5s\n","Kodu","Adı","Fiyat");
        System.out.printf(" %-3s   %-20s   %-5s\n","----","----","-----");
        for (Dish dish: this.dishList){
            System.out.printf(" %-3s   %-20s   %-5s Lira\n",dish.getCode(),dish.getName(),dish.getPrice());
        }
    }
    //Order için girilen ürün kodu hangi ürüne ait?
    public Dish findByDishByCode(int code){
        if (code==0){
            System.out.println("Ana menuye yönlendiriyorsunuz");
        }else {
            for (Dish dish: this.dishList){
                if (dish.getCode()==code){
                    return dish;
                }
            }
            System.out.println("Ürün bulunmadı.");
        }
        return new Dish(0,"",0);
    }

}
