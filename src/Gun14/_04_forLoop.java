package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int num=input.nextInt();
        int sum=0;
        for (int i=0;i<=num;i++){
            sum=sum+i;

        }
        System.out.println("sum = " + sum);

        /*Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi=oku.nextInt();

        int toplam=0; // 5 -> 1,2,3,4,5
        for(int i=1;i<=sayi; i++) {
            toplam = toplam + i;  // toplam+=i;
        }

        System.out.println("toplam = " + toplam);*/
    }
}
