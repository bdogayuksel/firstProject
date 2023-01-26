package gun03;

public class _02_dataTypes {
    public static void main(String[] args) {
        byte byteDeger=7;//-128...127
        short shortDeger=1645;//-3200...3200
        int intDeger=2500000;
        long longDeger= 12131341124141L;

        double doubleDeger=3.121321313131;//noktadan sonra 16 hane duyarlıdır
        float floatDeger=3.12123F;//noktadan sonra 7 hane duyarlıdır

        char basHarf='a';
        String isim="doga";

        System.out.println(byteDeger);
        System.out.println("isim = " + isim);//sotv olanı seç direk geliyor
        System.out.println("basHarf = " + basHarf);

    }
}
