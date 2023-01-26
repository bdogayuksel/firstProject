package gun20;

import java.util.Scanner;

public class _04_ReturnSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int a=input.nextInt();
        System.out.println("Sayı gir: ");
        int b=input.nextInt();

        int sum=total(a,b);

        System.out.println(sum);
    }

    public static int total(int s, int s1){

        return s+s1;
    }
}
