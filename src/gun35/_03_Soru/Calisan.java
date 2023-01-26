package gun35._03_Soru;

public class Calisan extends insan {

    private String departman;


    public Calisan(String ad, String soyad, String görev, String departman) {
        super(ad, soyad, görev);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public void belge() {
        System.out.println("calisan belgesi");
    }

    @Override
    public String toString() {
        return super.toString()+" departman: "+departman;
    }
}
