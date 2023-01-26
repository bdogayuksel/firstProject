package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        String text="Merhaba Dünya123";
        System.out.println("text = " + text);//ilk hali
        System.out.println("text = " + text.replaceAll("[abn]","_"));//a veya b veya n leri _ yap
        System.out.println("text.replaceAll(\"[A-Z]\",\"_\") = " + text.replaceAll("[A-Z]","_"));//A dan Zye kadar büyük harflri _ yap
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]",""));
        
    }
}
