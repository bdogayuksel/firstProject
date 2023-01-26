package gun12;

import java.util.Scanner;

public class _02_IfElseSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk tam sayı: ");
        int num1=input.nextInt();
        System.out.println("ikinci tam sayı: ");
        int num2=input.nextInt();
        System.out.println("harf gir: ");
        input.nextLine();
        String harf=input.nextLine();

        if (harf.equalsIgnoreCase("T")){
            System.out.println("toplam: "+(num1+num2));
        }
        else
            if (harf.equalsIgnoreCase("Ç")) {
            System.out.println("çıkarma: "+(num1-num2));

        }
        if (harf.equalsIgnoreCase("P")){
            System.out.println("Çarpma:"+(num1*num2));
        }

        if(harf.equalsIgnoreCase("B")){
            System.out.println("Bölme: "+(num1/num2));
        }


    }
}
