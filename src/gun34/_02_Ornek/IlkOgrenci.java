package gun34._02_Ornek;

public class IlkOgrenci extends Ogrenci {

    private String kulup;

    private Tipi tip;

    public Tipi getTip() {
        return tip;
    }

    public void setTip(Tipi tip) {
        this.tip = tip;
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    public IlkOgrenci(String isim,String kulup, Tipi tip) {
        super(isim);
        setKulup(kulup);
        setTip(tip);
    }

    @Override
    public String toString() {
        return super.toString()+getKulup()+" "+getTip();
    }
}
