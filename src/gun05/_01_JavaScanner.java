package gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //"SCANNER" input almak için kullanılır.
        Scanner okuyucu= new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int num= okuyucu.nextInt();//

        System.out.println("num = " + num);
    }
}
