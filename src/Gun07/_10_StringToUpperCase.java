package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        String text= "Merhaba Dünya";
        System.out.println("orijinal hali= "+ text);
        System.out.println("text.toUpperCase()= "+text.toUpperCase());

        System.out.println("me ve ya ME ile başlıyor mu= "+ text.toUpperCase().startsWith("ME"));

        System.out.println("text = " + text);
    }
}
