package gun13;

import java.util.Scanner;

public class _03_WhileSoru {
    public static void main(String[] args) {
        //girilen 20 sayının toplamını bas
        Scanner input=new Scanner(System.in);

        int count=0; int sum=0;
        while (count<20){
            System.out.print("sayı gir: ");
            int num=input.nextInt();
            sum=sum+num;

            count++;
        }

        System.out.println("sum = " + sum);
    }
}
