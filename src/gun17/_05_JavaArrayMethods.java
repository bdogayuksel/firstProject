package gun17;

import java.util.Arrays;

public class _05_JavaArrayMethods {
    public static void main(String[] args) {

        String [] names={"ahmet", "zeynep", "roman", "yasin","cihan"};

        //diziyi string olarak direk yazdırır
        System.out.println("names = " + Arrays.toString(names));

        //dizi sıralama

        Arrays.sort(names);//önce işlemi yap sonra bastır
        System.out.println("names = " + Arrays.toString(names));

        //diziler eşit mi?
        //t/f şeklinde döner
        int[] a={1,8,3,54};
        int[] b={1,99,3,54};
        int[] c={1,8,2,54};

        System.out.println("eşit mi= "+ Arrays.equals(a,b));
        System.out.println("eşit mi= "+ Arrays.equals(a,c));

        //c yi sırala ve ekrana bas
        Arrays.sort(c);
        System.out.println("c = " + Arrays.toString(c));

        //BINARY SEARCH
        //SADECE SIRALI DİZİLERDE ÇALIŞIR(ÖNCE SORTLAMAN LAZIM)
        //DAHA ÇOK VAR MI YOK MU İÇİN BAKILIR
        System.out.println("c de 2 yi bul: "+ Arrays.binarySearch(c,2));//küme içinde 2.sırada demek
        System.out.println("b de 3 Ü bul: "+ Arrays.binarySearch(b,3));//bulamayınca eksi değer basar
    }
}
