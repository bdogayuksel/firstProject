package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _08_JavaMethodSoru {
    public static void main(String[] args) {
        //Mainde kullanıcıdan 5 elemanlı dizi al
        //en küçük, en büyük  ve ortalamasını ayrı fonksiyonlarda
        //bul, yazdır

        Scanner input=new Scanner(System.in);
        int[] list=new int[5];
        for (int i = 0; i < list.length ; i++) {
            System.out.print("sayı gir: ");
            list[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(list));

        min(list);
        max(list);
        average(list);
    }

    public static void min(int list[]){
        int min=list[0];
        for (int i = 0; i < list.length; i++) {
            if(min>list[i]){
                min=list[i];
            }

        }
        System.out.println("min = " + min);

        //2.YOL
        //Arrays.sort(list);
        //System.out.println("min = " +list[0]);
    }

    public static void max(int[] list){
        int max=list[0];

       for (int i = 0; i < list.length; i++) {
            if(max<list[i]){
                max=list[i];
            }

        }
        System.out.println("max = " + max);

        //2.YOL
        //Arrays.sort(list);
        //System.out.println("max = " +list[list.length-1]);
    }

    public static void average(int list[]){
        int sum=0;
        int avg=0;

        for (int i = 0; i < list.length; i++) {
            sum+=list[i];
        }

        avg=sum/ list.length;

        System.out.println("avg = " + avg);
    }
}
