package gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str=input.nextLine();

        if(str.contains("a")||str.contains("A"))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

        //2.yol
         str=str.toLowerCase();
        if(str.contains("a"))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
