package gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student stu=new Student(1,"Doga","Yuksel");
        //ID YI STATİC YAPTIKTAN SONRA GELENLER
        Student stu1=new Student("Berk","yUKSEL");
        Student stu2=new Student("ASDAAS","yUKSEL");
        Student stu3=new Student("Berk","yASDASDAS");

        System.out.println("stu = " + stu);
        System.out.println("stu1 = " + stu1);
        System.out.println("stu2 = " + stu2);
        System.out.println("stu3 = " + stu3);
    }
}
