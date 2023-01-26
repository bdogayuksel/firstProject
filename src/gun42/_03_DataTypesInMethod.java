package gun42;

import java.util.Arrays;

public class _03_DataTypesInMethod {
    public static void main(String[] args) {
        //Özet:
        //1- İlkeltipler sadece 1değer saklarlar,
        //bu yüzden metodlara sadece değeri gider
        //Eşitlendiğinde sadece değeraktarılır.
        //2- Nesne tipler, ilkel tipten
        // farklı olarak NULL değeri alır.
        //Bu nedenle ilkel tip gibi davranır
        //3- Referans tipler metoda gönderildiklerinde
        // kendileri giderler.
        // Eşitlemelerde referanslar eşitlenir.



        //primitive type
        //kendisi değil değeri gider
        int sayi=5;
        sayiArtir(sayi);//burdaki artış değişkeni etkilemez
        System.out.println("sayi = " + sayi);//5

        //referans tipler
        //kendisi gider
        int[] dizi={1,2,3};
        diziSifirla(dizi);
        //referans tipler kendisi gider
        System.out.println("dizi= " + Arrays.toString(dizi));//0,0,0

        //nesne tipler
        String kelime="berk";
        kelimeSifirla(kelime);//primitive gibi davranır
        System.out.println("kelime = " + kelime);//berk
    }

    public static void sayiArtir(int a){
        a++;
    }

    public static void diziSifirla(int[] b){
        b[0]=0;
        b[1]=0;
        b[2]=0;
    }

    public static void kelimeSifirla(String c){
        c="";
    }
}
