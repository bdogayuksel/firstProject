package gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();
        merhabaYazIsme("doga");
        cokMerhabaYaz(6);
    }

    public static void merhabaYaz(){
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static void merhabaYazIsme(String isim){//değişken almasını istersen parametre olarak ekle

        System.out.println(isim+" merhaba");
    }

    public static void cokMerhabaYaz(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("merhaba");
        }
    }
}
