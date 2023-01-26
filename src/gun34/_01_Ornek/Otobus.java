package gun34._01_Ornek;

public class Otobus extends Arac{
    private int yolcuKapasitesi;
    public Otobus(String renk, double motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public void kapasite(){
        System.out.println("yolcuKapasitesi = " + yolcuKapasitesi);
    }

    //sag click-> generate->override methods->tostring
    //sonra bu geliyor
    @Override
    public String toString() {
        return super.toString()+"yolcu kapasitesi= "+this.yolcuKapasitesi+"}";//this.yolcukap yerine getyolcukap da olur
    }
}
