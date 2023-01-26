package gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayListSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list=new int[6];
        ArrayList<Integer> oddNums=new ArrayList<>();
        for (int i = 0; i < list.length ; i++) {
            System.out.print("Sayı gir: ");
            list[i]=input.nextInt();

            if(list[i]%2!=0){
                oddNums.add(list[i]);
            }
        }

        System.out.println("oddNums = " + oddNums);


    }
}
