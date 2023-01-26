package gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //girilen sayı tek mi çift mi
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=input.nextInt();

        if (num%2==0){
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
