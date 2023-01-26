package gun10;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("3 sayı gir: ");
        String nums=input.nextLine();


        int space=nums.indexOf(" ");
        int space2=nums.lastIndexOf(" ");

        String str1=nums.substring(0, space);
        String str2=nums.substring(space+1,space2);
        String str3=nums.substring(space2+1);

        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        int num3=Integer.parseInt(str3);

        if((num1+num2+num3)%2==0){
            System.out.println("even");
        }

        else{
            System.out.println("odd");
        }
    }
}
