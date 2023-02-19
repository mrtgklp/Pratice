package recap_lambda01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {
        Apartmant_Pojo apart01 = new Apartmant_Pojo("Dogu", 5000, 1);
        Apartmant_Pojo apart02 = new Apartmant_Pojo("Batı", 7500, 3);
        Apartmant_Pojo apart03 = new Apartmant_Pojo("Güney", 10000, 5);
        Apartmant_Pojo apart04 = new Apartmant_Pojo("Dogu", 15000, 7);

        List<Apartmant_Pojo> dairler = new ArrayList<>(Arrays.asList(apart01, apart02, apart03, apart04));
        System.out.println(tumDaireKira5000Buy(dairler));
        System.out.println("***************************");
        System.out.println(enAz1KatSayı2(dairler));
        System.out.println("*****************************");
        System.out.println(cepDoguOlan(dairler));
        System.out.println("******************************");
        System.out.println(katSayBuyKucSırala(dairler));
        System.out.println("*******************************");
        System.out.println(ktSy3FzOlnDairKirBuyKubSıra(dairler));
        System.out.println("*******************");
        katSay2FzlDairKirByKcSr2Yol(dairler);
        System.out.println("*********************************");
        System.out.println(katSay5AzDairKirKucBuySıra(dairler));

    }

    //Soru1: Tüm dairlerin kira'ların 4000'den buyuk ise return ederek True yazdırın
    public static boolean tumDaireKira5000Buy(List<Apartmant_Pojo> daire01) {
        Boolean result01 = daire01.stream().allMatch(t -> t.getKira() > 4000);
        return result01;
    }

    //Soru2:Dairlerden en az birinin kat sayısı 2 ise return ederek True yazdırın
    public static boolean enAz1KatSayı2(List<Apartmant_Pojo> daire02) {
        Boolean result02 = daire02.stream().anyMatch(t -> t.getKatSayısı() == 1);
        return result02;
    }

    //Soru3: Dairlerden cephesi 'dogu' olanların,sayısını return ederek yazdırın.
    public static long cepDoguOlan(List<Apartmant_Pojo> daire03) {
        long result03 = daire03.stream().filter(t -> t.getCephe().equalsIgnoreCase("dogu")).count();
        return result03;
    }

    //Soru4:Dairleri,katSayısına göre buyukten kucuge sıralayınız
    // list halinde return ederek yazdırın.
    public static List<Apartmant_Pojo> katSayBuyKucSırala(List<Apartmant_Pojo> daire04) {
        List<Apartmant_Pojo> result4 = daire04.stream().
                sorted(Comparator.comparing(Apartmant_Pojo::getKatSayısı).reversed()).
                collect(Collectors.toList());
        return result4;
    }

    //SORU5: katSayisi 3'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List<Integer> ktSy3FzOlnDairKirBuyKubSıra(List<Apartmant_Pojo> daire5) {
        List<Integer> result5 = daire5.stream().filter(t -> t.getKatSayısı() > 3).
                sorted(Comparator.comparing(Apartmant_Pojo::getKira).reversed()).
                map(t -> t.getKira()).limit(1).collect(Collectors.toList());
        return result5;
    }

    //2.yol
    public static void katSay2FzlDairKirByKcSr2Yol(List<Apartmant_Pojo> daire6) {
        Stream<Integer> result6 = daire6.stream().filter(t -> t.getKatSayısı() > 3).
                sorted(Comparator.comparing(Apartmant_Pojo::getKira).reversed()).
                map(t -> t.getKira()).limit(1);
        System.out.println(Arrays.asList(result6.toArray()));
    }
    //SORU6: katSayisi 5'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.
    public static List<Integer> katSay5AzDairKirKucBuySıra(List<Apartmant_Pojo> daire7){
        List<Integer> result7=daire7.stream().filter(t->t.getKatSayısı()<5).
                sorted(Comparator.comparing(Apartmant_Pojo::getKira)).
                map(t->t.getKira()).limit(1).
                collect(Collectors.toList());
        return result7;
    }


}
