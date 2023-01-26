package gun35._02_Polymorphism;

public class CiftlikMain {

    //POLIMORPHISM
    //CLASSLAR MİRAS ALDIKLARI CLASSLARIN ŞEKLİNE BÜRÜNEBİLİR
    public static void main(String[] args) {

        Kopek dog=new Kopek("Karabas");


        Kedi cat=new Kedi("kopuk");

        hayvanSesi(cat);
        hayvanSesi(dog);

        //*****************************************************


        //Referans tipi //nesne tipi
        Hayvan hay1=new Hayvan("ordek");//hayvanlardan 1 hayvan
        Hayvan hay2=new Kopek("kangal");//hayvanlardan 1 köpek
        Hayvan hay3=new Kedi("boncuk");//hayvanlardan 1 kedi

        //SADECE SES METHODU KULLANILABILIR ÇUNKU ORTAK OLAN O
        System.out.println("-------------------------");
        hay1.ses();//ses çıkardı
        hay2.ses();//havladi
        hay3.ses();//miyavladı
        System.out.println("-------------------------");

        ((Kopek)hay2).kokladı();
        //BURADA DEĞİŞKEN TİPİNI DEĞİŞTİREREK
        //classa özel methodları kullanabildik
        // int yerine (double)int yazmak gibi




    }

    //burada kedi ve köpek gönderdi. Ancak ikiside olması gereken sesleri çıkardı
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses();

        //hayvan bir köpek mi
        //öyleyse değişken tipi hayvan yerine köpek olsun
        if(hayvan instanceof Kopek)
            ((Kopek) hayvan).kokladı();


        //hayvan bir kedi mi
        //öyleyse değişken tipi hayvan yerine kedi olsun
        if (hayvan instanceof Kedi)
            ((Kedi) hayvan).tirmaladi();
    }
}
