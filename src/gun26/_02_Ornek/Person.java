package gun26._02_Ornek;

import java.util.Date;

public class Person {
    String name;
    String surname;
    int age;

    //3.YÖNTEM İÇİN
    public void printInfos(){//class içinde tanımlanan methodlarda static yazılmaz

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }


    //4.YÖNTEM İÇİN
    public String toString() {
        return name+" "+surname+" "+age;
    }

    public void getBirthYear(){

        int d= 2022-age;

        System.out.println("doğum yılı = " + d);
    }
    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+
                surname.toUpperCase().charAt(0)+".");
    }


   /* public String getBirthYear2(){
        int d= 2022-age;
        return "doğum yılı = " + d;
    }*/
}
