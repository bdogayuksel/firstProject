package gun33._03_OzelSoru;

public class GenelMudur extends Calisan{

    private int tazminat;

    public GenelMudur(String isim, int maas, int maasKatsayisi,int tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public int maashesapla() {
        return super.maashesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim=" + getIsim() +
                "maas=" + getMaas() +
                "maasKatsayisi=" + getMaasKatsayisi() +
                "tazminat=" + tazminat +
                "Ödenecek Maaş=" + maashesapla() +
                '}';
    }


}
