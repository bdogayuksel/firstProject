package gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String schoolName;
    private int capacity;
    private ArrayList<Ogrenci> students=new ArrayList<>();

    public Okul(String schoolName, int capacity) {

        setSchoolName(schoolName);
        setCapacity(capacity);

    }



    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Ogrenci> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Ogrenci> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "schoolName='" + schoolName + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
