package gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("enter name and surname: ");
        
        String fullName=input.nextLine();
        System.out.println("fullName = " + fullName);
        
    }
}
