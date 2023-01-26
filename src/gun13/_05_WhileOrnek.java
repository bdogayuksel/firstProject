package gun13;

import java.util.Scanner;

public class _05_WhileOrnek {
    public static void main(String[] args) {


        int num=1; int sum=0;

        while (num<=100){
            sum=sum+num;

            num++;
        }

        System.out.println("sum = " + sum);
    }
}
