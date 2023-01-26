package gun17;

import java.util.Scanner;

public class _04_JavaSplit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String cumle=input.nextLine();

        String[] lst=cumle.split(" ");

        for (int i = 0; i < cumle.length(); i++) {
            System.out.println("list = " + lst[i]);
        }
    }
}
