package gun04;

public class _07_parse {
    public static void main(String[] args) {
        String name="doga";
        String sayi="74";

        int yeniSayi=Integer.parseInt(sayi);//"parse" string'i int'e çevirir
        int toplam=yeniSayi+yeniSayi;
        System.out.println("toplam = " + toplam);


        String strToplam= Integer.toString(toplam)+name;//"toString" int'i string'e çevirir.
        System.out.println("strToplam = " + strToplam);
    }
}
