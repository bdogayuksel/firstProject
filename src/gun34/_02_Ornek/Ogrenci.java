package gun34._02_Ornek;

public class Ogrenci {
    private final int id;
    private String isim;

    private static int idSayac=1;


    public Ogrenci( String isim) {

        setIsim(isim);
        this.id=idSayac++;
    }



    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }
}
