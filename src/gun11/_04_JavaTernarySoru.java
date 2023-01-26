package gun11;

import java.util.Scanner;

public class _04_JavaTernarySoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int num=input.nextInt();

        /*String str=(num<50)?"0":"1";
        System.out.println("str = " + str);*/

        System.out.println((num<50)? 0:1);//YUKARDAKİYLE AYNI
    }
}
