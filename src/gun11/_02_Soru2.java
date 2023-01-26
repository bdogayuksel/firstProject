package gun11;

import java.util.Scanner;

public class _02_Soru2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç saat kaldın: ");
        int sure=input.nextInt();

        if(sure<3){
            System.out.println("10 tl");
        }
        else if (sure>3 &&sure<5) {
            System.out.println("15tl");

        }

        else {
            System.out.println("20 tl");
        }
    }
}
