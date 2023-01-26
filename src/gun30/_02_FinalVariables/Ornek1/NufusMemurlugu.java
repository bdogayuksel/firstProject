package gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    //final: değer atandıktan sonra değiştirilmesini engeller


    public static void main(String[] args) {
        Vatandas v1=new Vatandas("berk");
        Vatandas v2=new Vatandas("Doga");
        Vatandas v3=new Vatandas("yuksel");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=4; Çalışmaz çünkü tcNo final variable

    }
}
