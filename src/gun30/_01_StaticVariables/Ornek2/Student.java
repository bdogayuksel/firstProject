package gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String name;
    String surname;

    static int count=0;//static olmazsa id her zaman 0 olur
    //static yaparak değeri korumuş olduk


    public Student(String name, String surname) {
        this.id = count++;
        this.name = name;
        this.surname = surname;
    }


    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
