package gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.ad="Doga";
        mus1.soyad="Yuksel";


        mus1.MusteriHesap.paraYatir(100);
        mus1.MusteriHesap.bakiyeGoster();
        mus1.MusteriHesap.paraYatir(200);
        mus1.MusteriHesap.bakiyeGoster();
        mus1.MusteriHesap.paraCek(50);

        mus1.MusteriHesap.bakiyeGoster();


    }
}
