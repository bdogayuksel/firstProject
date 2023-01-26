package gun31._01_Enum;

public class Ornek {
    
    enum Aylar{//değişkenlerin sabit değer alması için kullanılır
        //tanimsiz, ocak 1'e eşit olsun diye yazdım
        tanimsiz,Ocak, Subat, Mart, Nisan, Mayis, Haziran, Temmuz, Agustos,
        Eylul, Ekim, Kasim, Aralik
        
    }

    public static void main(String[] args) {
        Aylar ay=Aylar.Ocak;
        
        switch (ay){
            case Ocak:
                System.out.println(31);
                break;
            case Subat:
                System.out.println(28);
                break;
            case Mart:
            case Nisan:
                System.out.println(30);
                break;
            case Mayis:
            case Haziran:
            case Temmuz:
            case Agustos:
            case Eylul:
            case Ekim:
            case Kasim:
            case Aralik:
        }
        
        if (ay==Aylar.Ocak)
            System.out.println("zam yapildi");

        for (Aylar a:Aylar.values()) {
            System.out.println("a.name() = " + a.name());
            System.out.println("a.ordinal() = " + a.ordinal());//indexini verir
            
        }
    }
}
