package gun04;

public class _02_tipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=100;
        byte ogrNot3=100;

        int toplam=ogrNot1;//byte için ayrılan alan int e siğar ve değişim olur(genişletme-widening casting)

        ogrNot1=(byte)toplam;//büyük hafıza ayrılmış bir alanı küçük yere koyamazsın başına (byte)koyman lazım(daraltma-narrowing casting)

    }
}
