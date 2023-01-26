package gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("notu gir: ");
        String str=input.nextLine();
        String[] strList=str.split(":");
        int grade=Integer.parseInt(strList[1]);
        if(grade>=90){
            System.out.println("A "+grade);
        } else
            if (grade>=80) {
                System.out.println("B "+grade);
        } else if (grade>=70) {
                System.out.println("C "+grade);
            } else if (grade>=60) {
                System.out.println("D "+grade);
            } else if (grade>=50) {
                System.out.println("E "+grade);
            } else {
                System.out.println("F "+grade);
            }

    }
}
