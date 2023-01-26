package gun32._03_Encapsulation;

public class Ogrenci {
    private String name;
    private String surName;
    private int age;

    private int ID;

    static int countID=1;

    public Ogrenci(String name, String surName, int age) {
        setName(name);
        setSurName(surName);
        setAge(age);
        setID(countID++);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
