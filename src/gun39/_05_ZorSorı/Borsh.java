package gun39._05_ZorSorı;

public class Borsh implements IFood{

    public Borsh() {
    }

    @Override
    public void taste() {
        System.out.println("suka");
    }

    @Override
    public double ucret() {
        return 0;
    }

    public void boil(){
        System.out.println("kaynıyor");
    }

    public void eatTomorrow(){
        System.out.println("yarın ye");
    }
}
