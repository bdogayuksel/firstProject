package gun39._05_cevap;

public class Lahmacun implements Gun39._05_OOP_Soru.IFood {

    @Override
    public void teste() {
        System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void dough(){
        System.out.println("Mayalı hamuz hazırlandı");
    }

    void addMeat(){
        System.out.println("Özel kıyma eklendi");
    }

    void bake(){
        System.out.println("Odun ateşinde ğişirildi");
    }
}
