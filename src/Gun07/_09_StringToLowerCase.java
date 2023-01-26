package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //string küçük harfe çevirir
        String text= "Merhana Dünya";

        System.out.println("orijinal hali= "+text);
        System.out.println("text.toLoewrCase() = "+ text.toLowerCase());
        System.out.println("me ikeya da ME ile balşıyor mu = "+ text.toLowerCase().startsWith("me"));
        System.out.println("text= "+ text);
        text=text.toLowerCase();

    }
}
