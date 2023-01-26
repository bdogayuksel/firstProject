package gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        //TAMAMEN DİNAMİK ARRAY
        //EKLEDİKÇE ARTAR ÇIKARDIKÇA KISALIR
        //DEFAULT OLARAK HEP EN SONA EKLER
        //BÜYÜK KÜÇÜK HARFE DUYARLI

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();


        ArrayList<String> names=new ArrayList<>();
        names.add( "Doga");
        names.add("yuksel");

        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());//UZUNLUĞU SIZEİLE BULUNUR
        //ADD
        names.add(0,"berk");//EN BAŞA ELEMAN EKLEDİ

        //SET-> KONUMDA BULUNAN ELEMANI DEĞİŞTİRİR
        names.set(1,"ahmet");
        System.out.println("names = " + names);

        //CONTAINS->VAR MI YOK MU ONA BAKAR
        boolean varMi=names.contains("ahmet");
        System.out.println("varMi = " + varMi);//true

        //REMOVE-> BİRDEN FAZLA AYNI DEĞER VARSA İLK DEĞERİ SİLER
        names.remove("berk");
        System.out.println("names = " + names);
        names.remove(1);//HER ZAMAN EĞER SAYI VERİRSEN INDEX OLARAK ALIR VE ORDAKİ DEĞERİ SİLER

        //INDEXOF->İSTENEN ELEMANIN HANGİ İNDEXDE OLDUĞUNU VERİR
        //EĞER AYNI İKİ ELEMAN VARSA YİNE İLKİNİ VERİR
        int index=names.indexOf("yuksel");
        System.out.println("names = " + names);

        //GET->İSTENEN INDEXDEKİ DEĞERİ ALIR
        String ilkEleman=names.get(0);
        System.out.println("ilkEleman = " + ilkEleman);

        //CLEAR-> BÜTÜN ELEMANLARI SİLER
        names.clear();

        System.out.println("names = " + names);


    }
}
