package gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
        Ogrenci og1= new Ogrenci("doga", "yUKSEL");

        System.out.println("og1 = " + og1);

        Ogrenci.okulAd="Atatürk ilkokulu";//burda değiştirirsen static olanda değişir sonra hep bu değeri basar
        System.out.println("og1 tekrar= " + og1);

    }
}
