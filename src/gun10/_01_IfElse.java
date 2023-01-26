package gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the grade: ");
        int grade=input.nextInt();

        if (grade<50){
            System.out.print("failed");
        }

        else {
            System.out.print("passed");
        }
    }
}
