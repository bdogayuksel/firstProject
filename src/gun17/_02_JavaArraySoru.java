package gun17;

import java.util.Scanner;

public class _02_JavaArraySoru {
    public static void main(String[] args) {

        //FOR İLE KELİME SAYISI BULMA
        //CÜMLEDEKİ BOSLUK SAYISININ 1 FAZLASI KELİME SAYISINI VERİR
        Scanner input=new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String sentence=input.nextLine();

        int boslukSayisi=0;

        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i)==' ')
                boslukSayisi++;
        }

        System.out.println("kelime sayisi = " + (boslukSayisi+1));
    }
}
