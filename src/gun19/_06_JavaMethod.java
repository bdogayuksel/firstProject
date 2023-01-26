package gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        oddOrEven(55);
        oddOrEven(74);
        oddOrEvenInput();//Scanner ile İNPUT ALMA
    }

    public static void oddOrEven(int num){
        if(num%2==1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }

    public static void oddOrEvenInput(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=input.nextInt();

        oddOrEven(num);//METHOD İÇİNDE METHOD ÇAĞIRABİLİYORUZ
    }
}
