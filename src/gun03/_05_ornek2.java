package gun03;

public class _05_ornek2 {
    public static void main(String[] args) {
        //yarıçapı r olan pi=3.14 olan daireni alan-cevre bul
        double r=5, pi=3.14;
        double alan= pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
