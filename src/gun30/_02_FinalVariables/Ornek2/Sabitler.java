package gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final int saatSayisi=24;
    final int dakika=60;
    final int saniye=60;

    public Sabitler(int s, int dk, int sn) {
        int total=(saatSayisi*s*dakika*saniye)+(dakika*dk*saniye)+(saniye*sn);

        System.out.println("total = " + total);
    }
}
