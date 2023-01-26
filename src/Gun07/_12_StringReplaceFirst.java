package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        //ilk karakteri değiştirir
        String  text= "Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a","e"));//Merhebe Dünye
        System.out.println("text.replace((\"Dünya\",\"java\")) = " + text.replace("Dünya","Java"));//Merhaba Java
        System.out.println("text.replaceFirst(\"a\",\"\") = " + text.replaceFirst("a",""));//ilk a silindi

    }
}
