package gun20;

public class _05_JavaMethodOzellikler {
    public static void main(String[] args) {
        //TİP FARKETMEKSİZİN AYNI İSİMLİ BİRDEN FAZLA FONKS YAZILABİLİR

        int s1=3;
        int s2=4;
        int s3=5;
        int s4=12;

        int sum1=total(s1,s2);
        int sum2=total(s1,s2,s3);
    }

    public static int total(int s1, int s2){
        return s1+s2;
    }

    public static int total(int s1, int s2, int s3){
        return s1+s2+s3;
    }
}
