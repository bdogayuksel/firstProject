package gun11;

import java.util.Scanner;

public class _09_JavaRandomSoru {
    public static void main(String[] args) {
        //TAHMİN YARIŞI
        Scanner input=new Scanner(System.in);
        System.out.println("Kaça kadar tutsun: ");
        int num=input.nextInt();
        int rnd=(int) (Math.random()*num);

        System.out.println("Tahmin: ");
        int tah=input.nextInt();

        if(rnd==tah)
            System.out.println("Bildiniz");
        else
            System.out.println("failed");
    }
}
