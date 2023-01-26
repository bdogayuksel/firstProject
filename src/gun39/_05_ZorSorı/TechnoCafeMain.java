package gun39._05_ZorSorı;

import java.util.Scanner;

public class TechnoCafeMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int secim=input.nextInt();

        do {
            System.out.println("***Menu***");
            switch (secim) {
                case 1:
                    System.out.println("1-Adana Kabap (55 TL)");
                    break;
                case 2:
                    System.out.println("2-Lahmacun (33 TL)");
                case 3:
                    System.out.println("3-Borsh (33 TL)");
                    break;
                case 4:
                    System.out.println("4-Palov (44 TL)");
                    break;
                case 5:
                    System.out.println("0-Tamam");
                    break;
            }
        }while (secim==5);


    }
}
