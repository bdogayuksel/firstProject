package gun33._03_OzelSoru;

public class Calisan {


    private String isim;
    private int maas;
    private int maasKatsayisi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    public Calisan(String isim, int maas, int maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public int maashesapla(){
        int totalMaas=maas*maasKatsayisi;

        return totalMaas;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +"odenecek maas: "+maashesapla()+
                '}';
    }
}
