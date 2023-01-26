package gun20;

public class _01_Return {
    public static void main(String[] args) {
        //RETURN -> EĞER ÇAĞIRILAN FONKS BİR DEĞERE EŞİTLENEBİLİYORSA RETURN KULLANILIR

        merhabaYaz();//giden yok dönen yok
        toplamYaz(4,5);//giden var dönen yok
        int enb=Math.max(4,5);//giden var, dönen var(çağırdığımız fonks bir variable a eşitleyebiliyorsak return olur)
        double sayi=Math.random();//giden yok, dönen var

        //FONK RETURN OLD İÇİN MAIN DE YAZDIRABİLİYORUZ
        //YANİ FONK SONUCUNU ALABİLİYORUZ
        //gun11 06 da burdan fonks kullandık
    }


    public static int enbBul(int a, int b){

        int donecek=0;

        if(a>b)
            donecek=a;
        else
            donecek=b;

        return donecek;
    }

    public static void enbYaz(int a,int b){

        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }


    public static void toplamYaz(int a, int b){
        System.out.println(a+b);
    }
    public static void merhabaYaz(){
        System.out.println("merhaba");
    }


}
