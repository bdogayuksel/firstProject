package gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("karenin kenar uzunluğunu gir: ");
        int kenar= input.nextInt();

        int alan=kenar*kenar;
        int cevre=4*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
