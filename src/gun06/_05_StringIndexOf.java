package gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        //HARF KAÇINCI SIRADA ONU BELİRLER
        String cumle="Merhaba dünya";
        
        int count= cumle.indexOf("a");
        System.out.println("count = " + count);
        System.out.println("cumle = " + cumle.indexOf("ha"));//3 verilen ifadenin başlangıç yerini verir
        System.out.println("cumle = " + cumle.indexOf(" ",5));//tekrar eden harfleri bulmak için(5. karakterden itibaren a'yı bul)

        
        
    }
}
