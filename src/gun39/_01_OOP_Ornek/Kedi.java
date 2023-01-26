package gun39._01_OOP_Ornek;

public class Kedi extends Hayvan{
    public Kedi(String name, boolean vahsi, String dogumTarihi) {
        super( name, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mama");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("1 kase");
    }

    @Override
    public void gunlukUykuSuresi() {

        System.out.println("12 saat");
    }

    @Override
    public void sesi() {

        System.out.println("miyav");
    }
}
