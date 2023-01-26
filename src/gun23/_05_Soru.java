package gun23;

import java.util.Arrays;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {

        int[] numArray= new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i]=(int)(Math.random()*11);

        }

        System.out.println(Arrays.toString(numArray));

        HashSet<Integer> hashlist=new HashSet<>();
        for (int i = 0; i < numArray.length; i++) {
            hashlist.add(numArray[i]);
            
        }

        System.out.println("hashlist = " + hashlist);
    }
}
