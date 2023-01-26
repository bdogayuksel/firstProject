package gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        //girilen bir ismi ekrana bas

        Scanner okuyucu= new Scanner(System.in);

        System.out.print("adı giriniz: ");
        String isim=okuyucu.next();

       /*
        okuyucu.next();// bir kelime okur.
        okuyucu.nextLine();// satırın tümünü okur
        okuyucu.nextInt();//int değeri okur
        okuyucu.nextShort();//short değer okur
        okuyucu.nextByte();//bytedeğeri okur
        okuyucu.nextLong();//long değer okur
        okuyucu.nextFloat();//float değer okur
        okuyucu.nextDouble();//Double değer okur
        */



        System.out.println("isim = " + isim);
    }
}
