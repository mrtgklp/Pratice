package recap_lambda01;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(birXeKadTop(10));
        System.out.println("/////////////////");
        System.out.println(birXeKdrTekSayTop(5));
        System.out.println("////////////////");
        System.out.println(birSonKaGiTkSayİkXTnTpSon(3));
        System.out.println("/////////");
        System.out.println(ikiSonCftXeTplm(3));
        System.out.println("/////////");
        System.out.println(besSonKuvXeKuvTop(3));
        System.out.println("///////////");
        System.out.println(faktöriyel(5));

    }
    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birXeKadTop(int x){
        int result1 = IntStream.range(1,x+1).sum();
        return result1;
    }
    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birXeKdrTekSayTop(int x){
        int result2 = IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();
        return result2;
    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız.
    public static int birSonKaGiTkSayİkXTnTpSon(int x){
        int result3= IntStream.iterate(1,t->t+2).limit(x).sum();
        return result3;
    }
    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikiSonCftXeTplm(int x){
        int result4= IntStream.iterate(2,t->t+2).limit(x).sum();
        return result4;
    }
    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int besSonKuvXeKuvTop(int x){
        int result5 = IntStream.iterate(5,t->t*5).limit(x).sum();
        return result5;
    }
    //Soru6: x sayısının faktoriyelini bulunuz.
    public static int faktöriyel(int x){
        int result6 = IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
        return result6;
    }

}
