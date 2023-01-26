package gun10;

import java.util.Scanner;

public class _02_IfElseSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter midterm grade: ");
        int midTerm=input.nextInt();
        System.out.print("enter final grade: ");
        int finalGrade=input.nextInt();

        double avg=(double) (midTerm+finalGrade)/2;

        if (avg<60){
            System.out.println("failed");
        }

        else {
            System.out.println("passed");
        }
    }
}
