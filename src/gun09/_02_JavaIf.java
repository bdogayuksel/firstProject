package gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter number: ");
        int num=input.nextInt();

        if(num<0){
            System.out.println("negative");
        }
        else if (num==0) {
            System.out.println("zero");

        }
        else {
            System.out.println("positive");
        }


    }
}
