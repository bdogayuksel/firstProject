package gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Okul sc=new Okul("Sabanci",3);




        do {
            System.out.println("Enter a student name: ");
            String name=input.nextLine();
            System.out.println("Enter a student surname: ");
            String surname=input.nextLine();

            System.out.println("Enter age of student: ");
            int age=okuInt.nextInt();

            if(age<15){
                Ogrenci a=new Ogrenci(name,surname,age);
                sc.getStudents().add(a);//öğrenciyi listeye ekler
            }

            else
                System.out.println("not allowed");


        }while (sc.getStudents().size()<sc.getCapacity());

        System.out.println("Students: "+sc.getStudents());
    }


}
