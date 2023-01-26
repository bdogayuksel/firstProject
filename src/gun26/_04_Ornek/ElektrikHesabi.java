package gun26._04_Ornek;

import java.util.ArrayList;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int tuk){

        toplamTuketim+=tuk;

    }

    public void toplamTuketimYaz(){

        System.out.println("toplam tüketim = " + toplamTuketim);
    }


    public void faturaYaz(String name){

        double toplamTutar=toplamTuketim*birimFiyat;

        System.out.println("***************************");
        System.out.println("      FATURA");
        System.out.println("***************************");
        System.out.println("Musteri: "+ name);
        System.out.println("Toplam tüketim: "+ toplamTuketim);
        System.out.println("Toplam tutar: "+Math.round(toplamTutar));
        System.out.println("****************************");
    }



}
