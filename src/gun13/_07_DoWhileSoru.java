package gun13;

import java.util.Scanner;

public class _07_DoWhileSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str;
        do {
            System.out.print("enter something: ");
            str=input.nextLine();

            if (!str.equalsIgnoreCase("x")) {
                System.out.println("Program Çalışıyor");
            }

        }while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti");

    }
}
