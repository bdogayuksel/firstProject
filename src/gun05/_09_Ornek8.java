package gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter weight: ");
        double weight= input.nextDouble();
        System.out.print("enter height: ");
        double height=input.nextDouble();

        System.out.println("height: "+ height+" "+"weight: "+weight);

        double kitleIndex= weight/(height*height);

        System.out.println("kitleIndex = " + kitleIndex);
    }
}
