package gun32._01_Encapsulation;

public class Kisi {
    private String name;
    private String surName;
    private int age;

    void setAge(int age){
        if(age>0){
            this.age=age;

        }
        else
            System.out.println("Age must be bigger than 0!!");
    }

    int getAge(){
        return this.age;
    }

    void setName(String name){
        if(name.length()<25)
            this.name=name;
        else
            System.out.println("Name cannot be more than 25");
    }

    String getName(){
        return this.name;
    }

    void setSurname(String surName){
        if(surName.length()<25)
            this.surName=surName;
        else
            System.out.println("Surname cannot be more than 25");
    }

    String getSurname(){
        return this.surName;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
