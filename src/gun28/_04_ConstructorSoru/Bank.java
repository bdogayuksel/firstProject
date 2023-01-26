package gun28._04_ConstructorSoru;

public class Bank {
    String name;
    int estDate;
    int sube;

    public Bank() {
    }


    public Bank(String name, int estDate) {
        this.name = name;
        this.estDate = estDate;
    }

    public Bank(String name, int estDate, int sube) {
        this.name = name;
        this.estDate = estDate;
        this.sube = sube;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", estDate=" + estDate +
                ", sube=" + sube +
                '}';
    }
}
