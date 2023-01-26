package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi = input.nextInt();
        int count = 0;
        boolean sqr = false;
        while (count < sayi) {
            if (count * count == sayi) {
                sqr = true;
                System.out.println("tam kare ifade");
                break;
            }
            count++;

        }

        if (sqr = false) {
            System.out.println("tam kare değidir");
        }

        // 5 girildi  , 5 kadar sayıları 1,2,3,4
        // 9 girildi  , 9 kadar sayıları 1,2,3,4,5,6,7,8

    }
}
