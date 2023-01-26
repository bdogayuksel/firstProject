package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random 10'a kadar olan sayılarla elemanla doldur
        //kullanıcıdan rakam al
        //kullanıcının gireceği rakamı arat
        //rakam dizide varsa indexini ekrana bastır
        Scanner input=new Scanner(System.in);

        int[] numArray=new int[10];

        for (int i = 0; i < numArray.length ; i++) {
            numArray[i]=(int)(Math.random()*11);

        }

        System.out.println("Rakam gir: ");
        int rakam=input.nextInt();

        Arrays.sort(numArray);

        System.out.println("rakam: "+ Arrays.binarySearch(numArray,rakam));

    }
}
