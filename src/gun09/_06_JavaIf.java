package gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String str=input.nextLine();

        if(str.contains("a"))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
