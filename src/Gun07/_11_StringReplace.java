package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        // bir string içindeki karakterleri verilenle değiştirir.

        String  text= "Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a","e"));//Merhebe Dünye
       // System.out.println("text.replace((\"Dünya\",\"java\")) = " + text.replace(("Dünya","Java"));//merhaba java
        System.out.println("text = " + text.replace("a",""));//a'lar silindi


    }
}
