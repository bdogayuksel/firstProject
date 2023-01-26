package gun10;

import java.util.Scanner;

public class _03_Soru2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter number: ");
        int num=input.nextInt();

        if (num%2==0){
            System.out.println("even number");
        }

        else{
            System.out.println("odd number");
        }
    }
}
