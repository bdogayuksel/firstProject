package gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int num=input.nextInt();

        if (num>10){
            System.out.println("bigger than 10");
        }


    }
}
