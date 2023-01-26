package gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {

        //Adres bilgilerini kullanıcıdan alıp ekrana bas

        Scanner sc= new Scanner(System.in);
        System.out.print("Cadde gir: ");
        String cadde=sc.nextLine();
        System.out.print("sokak gir: ");
        String sokak=sc.nextLine();
        System.out.print("posta kodu gir: ");
        Scanner input=new Scanner(System.in);//INT İÇİN AYRI SCANNER GEREKLİ
        int postaKodu=input.nextInt();
        System.out.print("ülke gir: ");
        String ulke=sc.nextLine();
        System.out.println("Caddde: "+cadde+" sokak: "+sokak+" posta kodu: "+postaKodu+" ülke: "+ulke);
    }
}
