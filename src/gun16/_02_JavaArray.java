package gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int[] grades=new int[5];

        Scanner input=new Scanner(System.in);

        int sum=0;

        for (int i=0;i<grades.length;i++){
            System.out.println("enter your grades: ");
            grades[i]=input.nextInt();

            sum+=grades[i];
        }

        int avg= sum/grades.length;

        int pass=0;

        for (int i=0;i<grades.length;i++){
            if (grades[i]>avg){
                System.out.println("Ortalamadan yüksek notlar: "+ grades[i]);
                pass++;
            }

        }

        System.out.println("avg = " + avg);
        System.out.println("pass = " + pass);
    }
}
