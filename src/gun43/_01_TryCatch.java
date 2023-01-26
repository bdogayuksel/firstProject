package gun43;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        try {//HATA OLMASI OLASI YERLERDE KULLANILIR
            Scanner input=new Scanner(System.in);

            System.out.println("Sai1: ");
            int sy1=input.nextInt();

            System.out.println("sai2: ");
            int sy2=input.nextInt();

            int bolum=sy1/sy2;
            System.out.println("bolum = " + bolum);
        }

        catch (Exception hata){
            System.out.println("hata: "+ hata.getMessage());
            System.out.println("Tekrar dene");
        }
    }
}
