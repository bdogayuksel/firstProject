package gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("uzun kenarı gir: ");
        int uzunKenar= input.nextInt();
        System.out.print("kısa kenarı gir: ");
        int kisaKenar= input.nextInt();

        int alan=uzunKenar*kisaKenar, cevre=2*(uzunKenar+kisaKenar);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
