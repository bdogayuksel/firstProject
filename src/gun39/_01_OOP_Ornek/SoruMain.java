package gun39._01_OOP_Ornek;

public class SoruMain {
    public static void main(String[] args) {
        Kedi cat=new Kedi("garfield",false,"12.3.1989");
        System.out.println("cat = " + cat);
        cat.yiyecegi();
        cat.yemekMiktari();
        cat.gunlukUykuSuresi();
        cat.sesi();


        Kartal eagle=new Kartal("kar",true,"12.3.1334");
        System.out.println("eagle = " + eagle);
        eagle.yiyecegi();
        eagle.yemekMiktari();
        eagle.gunlukUykuSuresi();
        eagle.sesi();
    }
}
