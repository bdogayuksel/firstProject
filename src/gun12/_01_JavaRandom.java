package gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //GİRİLEN MAX-MIN ARALIĞINDA RANDOM SAYI ÜRET
        Scanner input=new Scanner(System.in);
        System.out.print("min: ");
        int min=input.nextInt();
        System.out.print("max: ");
        int max=input.nextInt();

        int rndSayi=(int)(Math.random()*(max-min))+min;

        System.out.println("rndSayi = " + rndSayi);
    }
}
