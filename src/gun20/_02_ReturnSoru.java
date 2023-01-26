package gun20;

import java.util.Scanner;

public class _02_ReturnSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int a=input.nextInt();
        System.out.println("Sayı gir: ");
        int b=input.nextInt();
        int max= findMax(a,b);
        System.out.println(max);
    }

    public static int findMax(int a, int b){
        if(a>b)
            return a;
        else
            return b;

        //2.yol
        //return a>b? a:b;
    }
}
