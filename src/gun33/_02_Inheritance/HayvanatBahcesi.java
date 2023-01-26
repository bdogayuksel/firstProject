package gun33._02_Inheritance;

import com.sun.org.apache.xpath.internal.operations.Or;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kopek kop1=new Kopek("beyaz",50,"kangal");
        kop1.kopekSesi();
        System.out.println("kop1 = " + kop1);

        Kedi ked1=new Kedi("siyah",3,"tekir");
        ked1.kediSesi();
        System.out.println("ked1 = " + ked1);
        Ordek or1=new Ordek("yeşil",3,"gövel",90);
        or1.ordekSesi();
        System.out.println("or1 = " + or1);

        Yilan yil1=new Yilan("kahve",6,"kobraa",800);
        yil1.yilanSesi();
        System.out.println("yil1 = " + yil1);
    }
}
