package gun34._02_Ornek;

public class LiseOgrencisi extends Ogrenci{
    private String brans;

    private Tipi tip;



    public LiseOgrencisi( String isim, String brans, Tipi tip) {
        super(isim);
        setBrans(brans);
        setTip(tip);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public Tipi getTip() {
        return tip;
    }

    public void setTip(Tipi tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return super.toString()+this.getBrans()+" "+this.getTip();
    }
}
