package gun11;

import java.util.Scanner;

public class _07_JavaMathSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("3 sayı gir: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println("en büyük: "+Math.max(a,Math.max(b,c)));
    }
}
