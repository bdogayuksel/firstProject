package gun38._01_Abstract;


//1 interface+ 1 parent class varsa
// ikisini aynı yerde abstract class
//olarak kullanabilirsin

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdi;

    public BinekOto(String marka, int uretimYili, int videsAdi) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdi(vitesAdi);

    }

    //BU YUKARDAKI NOT İLE İLGİLİ
    //INTERFACE CLASS(IBinekOto) SYAFASINA AYRICA GEREK YOK
    abstract int HizlanmaSuresi();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdi() {
        return vitesAdi;
    }

    public void setVitesAdi(int vitesAdi) {
        this.vitesAdi = vitesAdi;
    }
}
