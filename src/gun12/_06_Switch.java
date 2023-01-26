package gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //GİRİLEN SAYININ BİRLER BASAMAĞINI YAZI İLE BAS
        //ONLAR BASAMAĞI İÇİN ÖRN 134->ÖNCE 10'A BÖL SONRA BÖLÜM%10 YAP
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int num=input.nextInt();

        int birBas=num%10;

        switch (birBas){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("sıfır");
                break;
        }
    }
}
