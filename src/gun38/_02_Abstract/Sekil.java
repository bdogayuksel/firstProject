package gun38._02_Abstract;

public abstract class Sekil {
    private String name;

    abstract double Alan();//soyut
    abstract double Cevre();//soyut

    public  void ciz(){//Somut
        System.out.println(name+" çizildi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sekil(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan: "+ Alan()+"cevre: "+Cevre();
    }
}
