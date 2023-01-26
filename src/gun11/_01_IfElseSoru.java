package gun11;

import java.util.Scanner;

public class _01_IfElseSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");

        int num=input.nextInt();

        if(num<0){
            System.out.println("negative");
        }
        else if (num==0) {
            System.out.println("sıfır");

        }
        else {
            System.out.println("positve");
        }
    }
}
