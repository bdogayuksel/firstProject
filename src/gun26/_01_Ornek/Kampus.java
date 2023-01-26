package gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Ogrencı ogr=new Ogrencı();
        ogr.okulNo=1;
        ogr.tamAd="Doga Yuksel";

        //1.YÖNTEM(Okul classını ilk öğrenciye bağladın)
        ogr.okulu=new Okul();
        ogr.okulu.adi="Sabanci";
        ogr.okulu.mudurAdi="Güler sabanci";
        ogr.okulu.ucreti=50000;

        //2.YÖNTEM(OKul classını en son öğrenciye bağladın)
        Okul ok=new Okul();
        ok.adi="Sabanci";
        ok.mudurAdi="Güler sabanci";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAdı = " + ogr.tamAd);
        System.out.println("okul adı = " + ogr.okulu.adi);
        System.out.println("mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti = " + ogr.okulu.ucreti);

        /*System.out.println("ok = " + ok.adi);
        System.out.println("ok = " + ok.ucreti);
        System.out.println("ok = " + ok.mudurAdi);
        System.out.println("ok = " + ogr.okulNo);
        System.out.println("ok = " + ogr.tamAd);*/


    }
}
