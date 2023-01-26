package gun38._03_Abstract;

public class FoodCourt {
    public static void main(String[] args) {
        Baklava bak=new Baklava();
        bak.madeIn();
        bak.taste();

        GreekSalad gs=new GreekSalad();
        gs.setName("Greek salad ");
        gs.madeIn();
        gs.taste();


        CheeseCake cs= new CheeseCake();
        cs.setName("Chesecake ");
        cs.madeIn();
        cs.taste();

        CeaserSalas ce= new CeaserSalas();
        ce.setName("Sezersalad ");
        ce.madeIn();
        ce.taste();
    }
}
