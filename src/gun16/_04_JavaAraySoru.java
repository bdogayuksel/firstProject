package gun16;

import java.util.Scanner;

public class _04_JavaAraySoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] numList= new int[7];
        int sum=0;

        for (int i = 0; i < numList.length; i++) {
            System.out.println("Sayı gir: ");
            numList[i]=input.nextInt();
            sum+=numList[i];

        }

        int avg=sum/ numList.length;
        int count=0;
        for (int i = 0; i < numList.length; i++) {
            if (numList[i]>avg && numList[i]%2==1){
                count++;
            }
        }
        System.out.println("avg = " + avg);
        System.out.println("Ortalama üstü sayılar = " + count);

    }
}
