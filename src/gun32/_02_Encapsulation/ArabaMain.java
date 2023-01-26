package gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba c1=new Araba();
        c1.setDoorNumber(3);
        c1.setColor("red");
        c1.setModel(2020);
        c1.setEngineVol(1.3);


        Araba c2=new Araba("blue", 2030,1.6,3);
        System.out.println("c2 = " + c2);



        //PROPERTYLERİ DOLDURDUK
        c1.setColor("red");
        c1.setModel(2020);
        c1.setEngineVol(1.6);
        c1.setDoorNumber(4);

        //PROPERTYLERİ ÇAĞIRDIK
        System.out.println(c1.getColor());
        System.out.println(c1.getModel());
        System.out.println(c1.getEngineVol());
        System.out.println(c1.getDoorNumber());

        System.out.println("c1 = " + c1);

    }
}
