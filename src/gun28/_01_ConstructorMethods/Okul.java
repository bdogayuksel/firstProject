package gun28._01_ConstructorMethods;

public class Okul {
    public static void main(String[] args) {
        //1.yol
        Student stu1=new Student();//nesne oluşma anı
        //parantez method olduğunu gösterir

        stu1.id=1;
        stu1.name="Doga";
        stu1.surname="Yuksel";
        stu1.hisClass=5;


        //2.yol
        Student stu2=new Student(2,"BERK","YUKSEK",3);
        System.out.println("stu2 = " + stu2.name);


        Student stu3=new Student(1,"Mehomo","ada");//eksik prametre ile çağırmak istediğimizde kullanırız
    }



}
