package gun13;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
        int count=0; int sum=0;

        while (count<20){
            System.out.print("sayı gir: ");
            int num=input.nextInt();
            if(num%2==1){
                sum+=num;
            }
            count++;
        }
        System.out.println("sum = " + sum);


    }


}
