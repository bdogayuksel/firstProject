package gun13;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int count=0; int sum=0;

        while(count<20){
            System.out.println("sayı gir: ");
            int num=input.nextInt();
            if(num>0){
                sum=sum+num;

            }
            count++;
        }
        System.out.println("sum = " + sum);
    }
}
