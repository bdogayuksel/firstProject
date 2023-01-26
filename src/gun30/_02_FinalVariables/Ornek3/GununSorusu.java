package gun30._02_FinalVariables.Ornek3;

public class GununSorusu {

    int a;
    static int b=0;

    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;

        //a static olmadığı için her nesnenin kendi a sı var
        //yani gs1 için a=5 gs2 için a=7 suan 2 a var yani

        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2 = " + gs2.a);
        //***********************************************
        //a ve b nin son değerleri nedir?

        gs1.artir();
        System.out.println("a = " + gs1.a+" b= "+gs1.b);
        gs2.artir();
        System.out.println("a = " + gs2.a+" b= "+gs2.b);


    }
}
