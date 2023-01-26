package gun35._03_Soru;

public class insan {
    private String ad;

    private String soyad;

    private String görev;

    public insan(String ad, String soyad, String görev) {
        setAd(ad);
        setSoyad(soyad);
        setGörev(görev);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGörev() {
        return görev;
    }

    public void setGörev(String görev) {
        this.görev = görev;
    }

    public void belge(){
        System.out.println("insan belgesi");
    }

    @Override
    public String toString() {
        return "insan{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", görev='" + görev + '\'' +
                ", ";
    }
}
