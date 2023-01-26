package gun35._03_Soru;

public class SoruMain {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("berk", "yuksel","twwd", "1-A");

        Calisan cal=new Calisan("Doga","lcak","dada","java");

        kimlik(ogr1);
        kimlik(cal);

    }

    public static void kimlik(insan i){
        i.belge();
    }
}
