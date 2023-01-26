package gun10;

import java.util.Scanner;

public class _07_Soru5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter 2 numbers: ");
        String nums=input.nextLine();
        int spaceIndex=nums.indexOf(" ");
        String str1=nums.substring(0,spaceIndex);
        String str2=nums.substring(spaceIndex+1);
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);

        if(num1==num2){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }

       /* int num1=input.nextInt();
        int num2=input.nextInt();

        if(num1==num2){
            System.out.println("equal");
        }

        else{
            System.out.println("no");
        }*/
    }
}
