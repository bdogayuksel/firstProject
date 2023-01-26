package gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutşak değeri: "+Math.abs(a));
        System.out.println("a ve b den büyük olanı: "+  Math.max(a,b));
        System.out.println("a ve b den küçük olanı: "+ Math.min(a,b));
        System.out.println("2 nin küpü: "+Math.pow(2,3));
        System.out.println("b nin karekökü: "+ Math.sqrt(b));
        System.out.println("round 3.1: "+ Math.round(3.1));//Yuvarlama
        System.out.println("ceil 3.1: "+Math.ceil(3.1));//yazılan rakamdan büyük en küçük tam sayı
        System.out.println("floow 3.1: "+Math.floor(3.1));//rakamdan küçük en büyük tam sayı



    }
}
