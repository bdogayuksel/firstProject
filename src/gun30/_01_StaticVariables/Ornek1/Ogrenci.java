package gun30._01_StaticVariables.Ornek1;

public class Ogrenci{
    String name;
    String surname;
    static String okulAd="Barbaros ilkokulu";//eğer static olursa bu değer değişmez


    public Ogrenci(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +okulAd+
                '}';
    }
}
