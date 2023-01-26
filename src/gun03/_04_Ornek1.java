package gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {
        //dikdörtgen kenarları tanımla, alan ve çevresini hesapla
        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=(2*kisaKenar)+(2*uzunKenar);
        int alan=kisaKenar*uzunKenar;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
