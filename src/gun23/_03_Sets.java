package gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        renkler.add("Blue");

        System.out.println("renkler = " + renkler);

        //EKRANA TEK TEK YAZDIRMA
        //FOREACH KULLAN
        //STRING, INT FARKETMEZ HER YERDE KULLANILIR(ARRAYLIST VB.)
        for (String eleman: renkler) {//sıra karışık
            System.out.println("eleman = " + eleman);

        }

        //ITERATOR=GÖSTERGE
        //SET'İN KENDİ SIRASI NASILSA ONUN AYNISINI VERİR
        Iterator gosterge= renkler.iterator();

        while (gosterge.hasNext()){
            System.out.println("gosterge = " + gosterge.next());
            //.Next göstergenin gösterdiği elemanı temsil ediyor.
        }
    }
}
