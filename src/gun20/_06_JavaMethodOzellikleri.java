package gun20;

public class _06_JavaMethodOzellikleri {
    public static void main(String[] args) {
        int s1=45;
        int s2=4;
        int s3=47;
        int s4=23;

        int sonuc1=toplamBul("doga",s1,s2);

    }

    //KAÇ ADET DEĞER VERECEĞİMİZ BELİDEĞİLSE PARANTEZ İÇİNE "..." KOY
    //BİRDEN FAZLA PARAMETRE VARSON SONDA OLMALI
    //BİR METHODDA SADECE 1 TANE OLUR
    public static int toplamBul(String name, int... sayilar){

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }

        return toplam;
    }
}
