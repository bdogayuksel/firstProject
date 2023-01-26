package gun42;

import java.util.Arrays;

public class _02_JavaDataTypes {
    public static void main(String[] args) {

        //prinitive: short, byte, long, float, boolean

        int say1=5;
        int sayi2=10;

        say1=sayi2;
        say1=34;
        sayi2=45;

        System.out.println("say1 = " + say1);
        System.out.println("sayi2 = " + sayi2);


        //Referans Tipler: class, dizi, array, nesne
        int[] dizi1={1,2,3,4,};
        int[] dizi2={5,6};

        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//5,6


        //birbrine eşitlenmiş 2 diziden
        //herhangi birindeki eleman değişirse
        //iki dizide de değişir
        //değerler aynı kutuda saklanır
        dizi1[0]=67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//67,6

        dizi2[0]=55;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//55,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//55,6


        //Nesne tipler(NULL alabilen ilkel tipler):String, Integer, Double, Long

        String ad1="berk";
        String ad2="doga";

        //aynı değeri alabilir, ama farklı kutularda tutar
        ad1=ad2;
        System.out.println("ad1 = " + ad1);//doga
        System.out.println("ad2 = " + ad2);//doga

        ad1="Ali";
        System.out.println("ad1 = " + ad1);//ali
        System.out.println("ad2 = " + ad2);//doga
    }
}
