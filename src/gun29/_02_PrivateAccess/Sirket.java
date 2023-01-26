package gun29._02_PrivateAccess;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal=new Calisan();

        cal.id=1;
        cal.name="Doga";
        cal.surname="Yuksel";

        cal.sifreAta("123456");
        cal.sifreAta("123456sanasldknsad");
        cal.showPassword();
    }
}
