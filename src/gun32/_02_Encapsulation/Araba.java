package gun32._02_Encapsulation;

public class Araba {
    private String color;
    private int model;
    private double engineVol;
    private int doorNumber;

    public Araba() {
    }

    public Araba(String color, int model, double engineVol, int doorNumber) {
        setColor(color);
        setModel(model);
        setEngineVol(engineVol);
        setDoorNumber(doorNumber);

        //altta bulunanlar doğrudan atayabilir
        //bu güvenlik açığı
        //bunu istemiyoruz
        /*this.color = color;
        this.model = model;
        this.engineVol = engineVol;
        this.doorNumber = doorNumber;*/
    }

    void setColor(String color){
        this.color=color;
    }

    String getColor(){
        return this.color;
    }

    void setModel(int model){
        if (model<2022)
            this.model=model;
        else
            System.out.println("Hatalı");
    }

    int getModel(){
        return this.model;
    }

    void setEngineVol(double engineVol){
        this.engineVol=engineVol;
    }

    double getEngineVol(){
        return engineVol;
    }

    void setDoorNumber(int doorNumber){
        this.doorNumber=doorNumber;
    }

    int getDoorNumber(){
        return this.doorNumber;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engineVol=" + engineVol +
                ", doorNumber=" + doorNumber +
                '}';
    }
}
