package gun04;

public class _03_WideninCasting {
    public static void main(String[] args) {
        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran=sayi;

        System.out.println("oran = " + oran);

        toplam=sayi;

        System.out.println("toplam = " + toplam);

        oran=toplam;

        System.out.println("oran = " + oran);



    }
}
