package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2.bölüm: carpimin degeri 10000 ü geçtiğinde işlem sonlansın.
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int num=input.nextInt();
        int sum=1;

        boolean limit=false;
        for (int i=1;i<=num;i++){
            sum*=i;

            if(sum>=10000){
                limit=true;
                System.out.println("limit is over");
                break;
            }
        }

        if(limit==false){
            System.out.println("sum = " + sum);
        }



        /*Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sinir=oku.nextInt();

        int carpim=1;
        boolean sinirAsildi=false;
        for(int i=1;i<=sinir;i++)
        {
            carpim=carpim*i;

            if (carpim >= 10000) {
                sinirAsildi=true;
                System.out.println("break çalıştı");
                break;
            }
        }

        if (sinirAsildi==false)
          System.out.println("carpim = " + carpim);*/

    }
}
