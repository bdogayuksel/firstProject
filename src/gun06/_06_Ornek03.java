package gun06;

import java.util.Scanner;

public class _06_Ornek03 {
    public static void main(String[] args) {
        //GİRİLEN AD SOYADIN İLK HARFLERİNİ YAZDIR
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name and surname: ");
        String fullName=sc.nextLine();
        int space=fullName.indexOf(" ");
        System.out.println("fullName = " + fullName.charAt(0)+"."+fullName.charAt(space+1)+".");

    }
}
