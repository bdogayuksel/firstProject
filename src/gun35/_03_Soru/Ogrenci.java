package gun35._03_Soru;

public class Ogrenci extends insan {


    private String sube;

    public Ogrenci(String ad, String soyad, String görev, String sube) {
        super(ad, soyad, görev);
        setSube(sube);
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    @Override
    public void belge() {
        System.out.println("öğrenci belgesi");
    }

    @Override
    public String toString() {
        return super.toString()+" sube: "+sube;
    }
}
