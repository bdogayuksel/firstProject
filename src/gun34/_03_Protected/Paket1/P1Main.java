package gun34._03_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi";//public erişildi
        p1h.yas=2;//default erişildi
        p1h.cins="tekir";//protected a erişildi



    }
}
