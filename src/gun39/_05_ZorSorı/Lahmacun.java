package gun39._05_ZorSorı;

public class Lahmacun implements IFood{

    public Lahmacun() {
    }

    @Override
    public void taste() {
        System.out.println("turkish ");
    }

    @Override
    public double ucret() {
        return 0;
    }

    public void dough(){
        System.out.println("hamur açılıyor");
    }

    public void addMeat(){
        System.out.println("Harç eklendi");
    }

    public void bake(){
        System.out.println("firina atıldı");
    }
}
