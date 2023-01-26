package gun33._02_Inheritance;

public class Kedi extends Kopek{

    public Kedi(String renk, int kilo, String cins) {
        super(renk, kilo, cins);
    }

    public void kediSesi(){
        System.out.println("mır mır");
    }
}
