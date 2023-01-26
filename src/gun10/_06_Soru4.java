package gun10;

import java.util.Scanner;

public class _06_Soru4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter password: ");
        String pass=input.nextLine();

        if(pass.length()<8 || pass.toLowerCase().contains("pass") || pass.length()>12){
            System.out.println("yeniden gir");
        }

        else{
            System.out.println("okay");
        }
    }
}
