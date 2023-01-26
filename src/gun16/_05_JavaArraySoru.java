package gun16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _05_JavaArraySoru {
    public static void main(String[] args) {

        String[] strList={"trt", "fox", "atv","star","show"};
        String randomString = strList[(int)(Math.random() * strList.length)];


        System.out.println("Rasgele tv kanalı = " + randomString);



        //TODO: DÖNGÜ İLE 5 TANE BULSUN ANCAK AYNI İTEMİ 2.KEZ BULMASIN

        Random numberGenerator = new Random();
        /* Generate A Random Number */
        int nextRandom = numberGenerator.nextInt(6);
        Set<Integer> validate = new HashSet<>();
        /* Add First Randomly Genrated Number To Set */
        validate.add(nextRandom);
        for (int i = 0; i < 5; i++) {
            /* Generate Randoms Till You Find A Unique Random Number */
            while(validate.contains(nextRandom)) {
                nextRandom = numberGenerator.nextInt(6);
            }
            /* Add Newly Found Random Number To Validate */
            validate.add(nextRandom);
            System.out.println(strList[nextRandom]);
        }

    }
}
