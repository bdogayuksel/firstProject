package gun17;

public class _03_CharVeSayi {
    public static void main(String[] args) {

        int num=65;

        System.out.println("num = " + num);

        char harf=(char) num;//ASCII DEKİ 65'İN HARF HALİ

        System.out.println("harf = " + harf);

        for (int i = 0; i <=255 ; i++) {
            harf=(char) i;

            System.out.println(i+". harf = " + harf);
        }

    }
}
