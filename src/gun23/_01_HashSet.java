package gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        //HATIRLATMA
        ArrayList<Integer> liste=new ArrayList<>();

        //2 BOYUTLU, BOYUTU EKLEDİKÇE ARTAN SİLDİKÇE AZALAN DİZİ
        ArrayList<ArrayList<Integer>> listelerinlistesi=new ArrayList<>();

        /************************************/

        //HASHSET-> ELEMAN EKLEDİKÇE HIZLIÇALIŞMAK İÇİN KENDİNE GÖRE BİR SIRALAMADA ELEMANLARI TUTAR
        //LİNKEDHASHSET-> SEN EKLEDİKÇE, EKLENME SIRASINA GÖRE ELEMANLARI SAKLAR
        //TREESET->SEN EKLEDİÇE ONLARI HER ZAMAN sıralı TUTAR
        //HEPSİNİN ORTAK ÖZELLİĞİ HİÇ tekrar DEĞER BULUNDURMAZ

        HashSet<Integer>hs1= new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);
        hs1.add(2);
        System.out.println("hs1 = " + hs1);

        //HIZLI ÇALIŞIR
        //küçükten büyüğe SIRALAMAZ
        //Tekrarlı ifadeler olmaz



    }
}
