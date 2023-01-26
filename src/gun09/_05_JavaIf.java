package gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter the grade: ");
        int grade=input.nextInt();

        if(grade<50){
            System.out.println("failed this course");
        }
        else {
            System.out.println("passed this course");
        }
    }
}
