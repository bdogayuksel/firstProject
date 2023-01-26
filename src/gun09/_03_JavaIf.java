package gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);

        System.out.print("İlk sayı: ");
        int a=num1.nextInt();
        System.out.print("ikinci sayı: ");
        int b=num1.nextInt();

        if (a<b){
            System.out.println("büyük olan = " + b);
        }
        else if (a==b) {

            System.out.println("eşit");
        }
        else {
            System.out.println("büyük olan = " + a);
        }
    }
}
