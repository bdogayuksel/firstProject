package gun39._01_OOP_Ornek;

public class Kartal extends Hayvan{
    public Kartal(String name, boolean vahsi, String dogumTarihi) {
        super( name, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("et");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("cok");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("az");
    }

    @Override
    public void sesi() {
        System.out.println("gak gak");
    }
}
