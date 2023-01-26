package gun34._02_Ornek;

public class OkulMain {
    public static void main(String[] args) {
        LiseOgrencisi lo=new LiseOgrencisi("berk","mf",Tipi.LISE);
        IlkOgrenci io=new IlkOgrenci("doga","muzik",Tipi.ILK);


        System.out.println("lo = " + lo);
        System.out.println("io = " + io);
    }
}
