package gun27._03_Ornek;

public class Soru {
    public static void main(String[] args) {

        Student.collegeRules();//static methodları class adıyla çağırırız

        Lesson less1=new Lesson();
        less1.name="Algo";
        less1.hour=4;

        Lesson less2=new Lesson();
        less2.name="Java";
        less2.hour=4;

        Lesson less3=new Lesson();
        less3.name="Test Tools";
        less3.hour=3;

        Student stu1=new Student();
        stu1.name="Doga Yuksel";
        stu1.maxHour=10;
        stu1.addLesson(less1);
        stu1.addLesson(less2);
        stu1.addLesson(less3);
        stu1.printLessons();




    }
}
