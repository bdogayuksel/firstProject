package gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String name;
    final int tcNo;//final yazarak sonradan değeri değiştiremezsin
    //final olunca kendi classında olsa bile değiştiremezsin
    static int tcNoCount=1;

    public Vatandas(String name) {
        this.name = name;
        this.tcNo = tcNoCount++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "name='" + name + '\'' +
                ", tcNo=" + tcNo +"tcNo:"+tcNo+
                '}';
    }
}
