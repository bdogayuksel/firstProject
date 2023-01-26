package gun10;

import java.util.Scanner;

public class _05_Soru3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter string: ");
        String str=input.nextLine();

        if (str.length()>10 && str.contains("study")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
