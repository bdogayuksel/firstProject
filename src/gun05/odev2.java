package gun05;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //1
        System.out.print("enter your name: ");
        String name=input.nextLine();
        System.out.println("name = " + name);
        //2
        System.out.print("enter a number: ");
        int num=input.nextInt();
        System.out.println("num = " + num);
        //3
        System.out.print("enter your fav fruit: ");
        String fruit=input.next();
        System.out.println("fruit = " + fruit);
        //4
        System.out.print("enter vehicle door number: ");
        int carDoor=input.nextInt();
        System.out.println("carDoor = " + carDoor);
        //5
        System.out.print("10 sene önce yaşadığın sehir: ");
        String sehir=input.next();
        System.out.println("sehir = " + sehir);
        //6
        System.out.print("Birth Date: ");
        String date=input.next();
        System.out.println("date = " + date);
        //7 SOR
        System.out.print("Is there any bank account: ");
        Boolean acc=input.nextBoolean();
        System.out.println("acc = " + acc);
        //8
        System.out.print("kg: ");
        byte kg=input.nextByte();
        System.out.println("kg = " + kg);
        //9
        System.out.print("boy: ");
        float boy= input.nextFloat();
        System.out.println("boy = " + boy);



    }

}
