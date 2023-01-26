package gun26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {

        Person per1=new Person();
        per1.name="Berk";
        per1.surname="Yuksel";
        per1.age=25;

        Person per2=new Person();
        per2.name="Doga";
        per2.surname="Demir";
        per2.age=39;

        //1.YÖNTEM
        /*System.out.println("name = " + per1.name);
        System.out.println("surname = " + per1.surname);
        System.out.println("age = " + per1.age);

        System.out.println("name = " + per2.name);
        System.out.println("surname = " + per2.surname);
        System.out.println("age = " + per2.age);*/

        //2.YÖNTEM
        //printInfos(per1);
        //printInfos(per2);

        //3.YÖNTEM
       per1.printInfos();
       per2.printInfos();

        //4.YÖNTEM
        //EĞER SADECE PRINT ISTIORSAN 1 TANE TOSTRING CLASS IOLUSTUR
        //PERSON'UN İÇİNDE OLUŞTUDUK. PRINT OTOMATIK ONU ARAR
        System.out.println("per1 = " + per1);

        //////////////////////////////////////

        //Doğum tatihlerni vermek için
        per1.getBirthYear();
        per2.getBirthYear();

        //ad soyad baş harfleri bas
        per1.getInitials();
        per2.getInitials();
    }

    //2.YÖNTEM İÇİN YAZDIK
    public static void printInfos(Person p){

        System.out.println("name = " + p.name);
        System.out.println("surname = " + p.surname);
        System.out.println("age = " + p.age);
    }


}
