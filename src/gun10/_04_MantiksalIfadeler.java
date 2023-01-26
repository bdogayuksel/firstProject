package gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=input.nextInt();

        if(num%2==1 && num>0){
            System.out.println("okay");
        }
        else{
            System.out.println("wrong");
        }
    }
}
