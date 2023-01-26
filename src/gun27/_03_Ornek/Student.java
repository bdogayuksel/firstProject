package gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxHour;

    ArrayList<Lesson> lessons = new ArrayList<>();

    public void addLesson(Lesson l) {//Class'ın diğer propertilerei kullandığı için static olmaz

        int totalHours = 0;
        for (Lesson a : lessons) {//ARRAY LİST OLDUĞU İÇİN BUNU KULLANIDK
            totalHours += a.hour;
        }

        if (totalHours + l.hour <= maxHour) {
            lessons.add(l);
        } else
            System.out.println(l.name + " Max capacity");


    }



    public void printLessons(){
        System.out.println("***Transkript***");
        System.out.println("Sayın "+name+" ");
        System.out.println("Dersler");
        for (Lesson l :lessons) {
            System.out.println(l.name+" "+l.hour);

        }
    }


    public static void collegeRules(){
        System.out.println("1. LKNSALNSALNSALNCSA");
        System.out.println("2.Sleep well");
        System.out.println("SEX WITH CONDOM :)");
    }

}
