package gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        //GET-SET MUHABBETİ
        //DEĞİŞKENLERE ATANAN DEĞERLERİ
        //KONTROL EDİP ÖYLE ATAMAN LAZIM
        //BUNA ENCAPSULLATION DENİR.
        //OOP'NIN 4 KURALINDAN BİRİ
        Kisi k1=new Kisi();

        //k1.name="Berk";
        //k1.surName="Yuksel";
        //k1.age=-25; NEGATİF DEĞER SORUN

        k1.setName("Berk");
        k1.setSurname("Yuksel");
        k1.setAge(-25);

        System.out.println(k1.getAge());
        System.out.println(k1.getName());
        System.out.println(k1.getSurname());

        System.out.println("k1 = " + k1);



    }
}
