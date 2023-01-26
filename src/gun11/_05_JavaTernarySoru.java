package gun11;

import java.util.Scanner;

public class _05_JavaTernarySoru {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("sayı gir: ");
        int num=input.nextInt();

        System.out.println((num==0)?"sıfır":(num<0)?"negative":"postive");
    }
}
