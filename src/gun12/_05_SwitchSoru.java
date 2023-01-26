package gun12;

import java.util.Scanner;

public class _05_SwitchSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayı: ");
        int num1=input.nextInt();
        System.out.println("ikinci sayı: ");
        int num2=input.nextInt();
        System.out.println("harf gir: ");
        input.nextLine();
        String hes=input.nextLine();

        switch (hes.toUpperCase()){
            case "T":
                System.out.println("toplam: "+(num1+num2));
                break;
            case "Ç":
                System.out.println("çıkarma: "+(num1-num2));
                break;
            case "P":
                System.out.println("Çarpma:"+(num1*num2));
                break;
            case "B":
                System.out.println("Bölme: "+(num1/num2));
                break;

        }

    }
}
