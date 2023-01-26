package gun34._03_Protected.Paket2;

import gun34._03_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Kopek";//public erişildi
        //p1h.yas ulaşılmaz çünkü default variable
        //p1h.cins ulaşılmaz çünkü protected

    }
}
