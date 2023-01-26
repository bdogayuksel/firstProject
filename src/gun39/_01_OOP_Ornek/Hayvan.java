package gun39._01_OOP_Ornek;

import gun38._03_Abstract.Salad;

public abstract class Hayvan {
    private int id;
    private String name;
    private boolean vahsi;
    private String dogumTarihi;

    private static int countId=1;//ID LER UNIQ OLDU

    public Hayvan( String name, boolean vahsi, String dogumTarihi) {
       setId(countId++);
       setName(name);
       setVahsi(vahsi);
       setDogumTarihi(dogumTarihi);


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }




    abstract public void yiyecegi();

    abstract public void yemekMiktari();

    abstract public void gunlukUykuSuresi();

    abstract public void sesi();

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
