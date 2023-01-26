package gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        //2 den fazla condition varsa kullan
        //break olmazsa istenen caseden başlayıp sonraki caseleri de yazdırır

        Scanner input=new Scanner(System.in);
        System.out.println("Gün no: ");
        int dayNo=input.nextInt();

        switch (dayNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default://else gibi düşün
                System.out.println("Hatalı");
        }
    }
}
