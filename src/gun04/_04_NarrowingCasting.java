package gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;
        
        sayi=(int) oran;//int e double koymak istiyorsun, küsuratı almaz

        System.out.println("sayi = " + sayi);
    }
}
