package gun33._02_Inheritance;

public class Ordek extends Kopek {

    private int kanat;

    public Ordek(String renk, int kilo, String cins, int kanat) {
        super(renk, kilo, cins);
        setKanat(kanat);
    }

    public int getKanat() {
        return kanat;
    }

    public void setKanat(int kanat) {
        this.kanat = kanat;
    }

    public void ordekSesi(){
        System.out.println("vak vak");


    }
}
