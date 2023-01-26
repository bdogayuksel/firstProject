package gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 yazana kadar giren sayıları topla
        Scanner input=new Scanner(System.in);

        int sum=0;
        int num;//içeri girmeden tanımla
        do {
            System.out.println("Sayı gir: ");
             num=input.nextInt();
             sum+=num;


        }while (num!=0);
        System.out.println("sum = " + sum);
    }

}
