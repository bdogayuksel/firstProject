package gun28._01_ConstructorMethods;

public class Student {

    int id;
    String name;
    String surname;
    int hisClass;

    public Student(){//CONSTRUCTOR METHODLAR new Student da methodmus
        System.out.println("object created");
    }//NESNE OLUŞTURURKEN YAPMAK İSTEDİKLERİNİ BURDA YAP

    public Student(int id, String name, String surname, int hisClass ){
        this.id=id;//this.ad: classın id si, id local değişken parametresi
        this.name=name;//ANLAMI: STUDENT CLASSININ NAME İNE BURADAKİ NAME İ AT
        this.surname=surname;
        this.hisClass=hisClass;

    }

    public Student(int id, String name, String surname ){

        this(id,name,surname,0);//THIS YUKARIDAKI STUDENT METHODU ANLAMINDA, BOŞ OLDUĞU İÇİN 0 VERDİK

    }

}
