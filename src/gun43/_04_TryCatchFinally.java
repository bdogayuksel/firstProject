package gun43;

public class _04_TryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;

        String str="";


        try{

            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kisim");
            char ilkHard=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }

        catch (Exception ex){

            System.out.println("Catch blogu çalıştı");

        }

        finally //hata olsada olmasada çalışır.
                 // Amacı yukarıdakı süreçle alakalı olduğunu göstermek
        {

            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılcaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
