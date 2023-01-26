package gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        //GİRİLEN SAYI TEK Mİ ÇİFT Mİ
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
        int num=input.nextInt();

        String sum=(num%2==0)?"even":"odd";//? => if  :=>else anlamında

        System.out.println("sum = " + sum);

    }
}
