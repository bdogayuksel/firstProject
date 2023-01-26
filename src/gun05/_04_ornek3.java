package gun05;

import java.util.Scanner;

public class _04_ornek3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter name: ");
        String name=input.next();

        System.out.print("enter surname: ");
        String surName= input.next();

        System.out.println(name+" "+surName);


    }
}
