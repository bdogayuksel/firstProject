package gun33._02_Inheritance;

public class Kopek {
    private String renk;
    private int kilo;
    private String cins;

    public String getRenk() {
        return renk;
    }

    public void kopekSesi(){
        System.out.println("hav hav");
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }



    public Kopek(String renk, int kilo, String cins) {
       setRenk(renk);
       setKilo(kilo);
        setCins(cins);
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cins='" + cins + '\'' +
                '}';
    }
}
