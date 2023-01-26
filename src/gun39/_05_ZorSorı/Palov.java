package gun39._05_ZorSorı;

public class Palov implements IFood{

    public Palov() {
    }

    @Override
    public void taste() {
        System.out.println("bled");
    }

    @Override
    public double ucret() {
        return 0;
    }

    public void fry(){
        System.out.println("kızarıyor");
    }

    public void boil(){
        System.out.println("kaynıyor");
    }
}
