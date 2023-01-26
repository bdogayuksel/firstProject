package gun06;

public class _07_StringConCat {
    public static void main(String[] args) {
        //İKİ STRINGI BİRLEŞTİRMEK İÇİN KULLANILIR
        //"+" gibi çalışır
        String s1="merhaba";
        String s2="dünya";

        System.out.println("birleşik = " + s1.concat(" ").concat(s2));//bu ve alttaki aynı
        System.out.println("birleşik = "+ s1.concat(" "+s2) );
        System.out.println("birleşik = "+ s1.concat("mars"));//yeni kelime de eklenebilir
    }
}
