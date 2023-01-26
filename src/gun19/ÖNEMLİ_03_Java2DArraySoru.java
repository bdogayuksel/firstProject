package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class ÖNEMLİ_03_Java2DArraySoru {
    public static void main(String[] args) {
        //3X2 LİK MATRİX AL MATRİXDEKİ TEK ELEMANLARI YENİ BR MATRİXE BAS
        Scanner input=new Scanner(System.in);

        int[][] table=new int[3][2];

        int oddCount=0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("değerleri gir: ");
                table[i][j]=input.nextInt();

                if(table[i][j]%2==1){
                    oddCount++;
                }
            }

        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        int[] oddTable=new int[oddCount];//array uzunluğu girilen tek sayı miktarı kadar

        oddCount=0;//yeni array için sıfırladık baska variable da kullanabiliriz
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(table[i][j]%2==1){
                    oddTable[oddCount]=table[i][j];
                    oddCount++;
                }
            }

        }
        System.out.println(Arrays.toString(oddTable));
    }
}
