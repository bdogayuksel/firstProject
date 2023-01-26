package gun33._02_Inheritance;

public class Yilan extends Kopek{

    private int uzunluk;
    public Yilan(String renk, int kilo, String cins, int uzunluk) {
        super(renk, kilo, cins);
        setUzunluk(uzunluk);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void yilanSesi(){
        System.out.println("tıs tıs");
    }
}
