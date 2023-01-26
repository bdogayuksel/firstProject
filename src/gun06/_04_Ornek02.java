package gun06;

import java.util.Scanner;

public class _04_Ornek02 {
    public static void main(String[] args) {
        //GİRİLEN CÜMLENİN SON HARFI BASTIR
        Scanner input= new Scanner(System.in);
        System.out.print("String yaz: ");
        String cumle=input.nextLine();
        int uzunluk= cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);
        System.out.println("son harf = " + sonHarf);
    }
}
