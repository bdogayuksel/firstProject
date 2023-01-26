package gun38._01_Abstract;

public class otoMain {
    public static void main(String[] args) {
        Ford fr= new Ford("mustang",1995,4);

        //Interfacelerden NESNE oluşturulamaz sadece REFERANS tip olabilirler
        //IBinekOto ib=new IBinekOto(); BU OLMAZ

        //BinekOto bo=new BinekOto()//Abstract classlardan da NESNE oluşturulamaz
        //Sadece referans tipi olabilir
    }
}
