package gun20;

import java.util.Scanner;

public class _03_ReturnSoru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int a=input.nextInt();
        int f= fac(a);

        System.out.println(f);

        if(f%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }


    public static int fac(int s) {
        int sum = 1;

        for (int i = 1; i <= s; i++) {
            sum*=i;
        }

       return sum;
    }
}
