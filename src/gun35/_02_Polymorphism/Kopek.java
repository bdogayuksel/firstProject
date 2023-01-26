package gun35._02_Polymorphism;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladı");
    }


    public void kokladı() {
        System.out.println("Kokladı");
    }
}
