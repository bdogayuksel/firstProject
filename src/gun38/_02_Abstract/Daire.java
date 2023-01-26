package gun38._02_Abstract;

public class Daire extends Sekil{

    private double yariCap;

    private double pi=3.14;


    public Daire(String name, double yariCap, double pi) {
        super(name);
        setYariCap(yariCap);
        setPi(pi);

    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    double Alan() {
        return this.yariCap*this.yariCap*this.pi;
    }

    @Override
    double Cevre() {
        return 2*this.pi*this.yariCap;
    }
}
