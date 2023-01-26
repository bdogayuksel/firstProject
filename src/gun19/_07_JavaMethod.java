package gun19;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {
        //MAINDE 20 LİK ARRAY YARAT SONRA FONKSİYONA GÖNDER
        //ORDA 100 E KADAR RANDOM SAYILARLA DOLDUR
        int[] list=new int[20];
        arrayRandom(list);
    }

    public static void arrayRandom(int[] list){
        for (int i = 0; i < list.length; i++) {
            list[i]=(int)(Math.random()*100);//BU ÖNEMLİ
        }

        System.out.println("list = " + Arrays.toString(list));
    }
}
