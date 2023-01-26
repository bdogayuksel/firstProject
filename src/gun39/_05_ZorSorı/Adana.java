package gun39._05_ZorSorı;

public class Adana implements IFood{

    public Adana() {
    }

    @Override
    public void taste() {
        System.out.println("manyak bi adana");
    }

    @Override
    public double ucret() {
        return 0;
    }

    public void marinade(){
        System.out.println("Marine ediliyor");
    }

    public void grill(){
        System.out.println("izgarada");
    }


}
