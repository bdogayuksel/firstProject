package gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        //String içinde aranan karakterin var yok durumu(boolean)
        
        String cumle="merhaba dünya";
        
        boolean varMı= cumle.contains("venus");//"venus yukardaki cumlede var mı bak
        System.out.println("varMı = " + varMı);
        System.out.println("a var mı = " + cumle.contains("a"));//a var mı?

    }
}
