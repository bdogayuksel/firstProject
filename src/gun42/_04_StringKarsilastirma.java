package gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        //Stringlerde neden == yerine equal kullanılır
        //ilkel tip gibi davranır
        String cumle1="Bugun hava cok guzel";
        String cumle2="Bugun hava cok guzel";


        if (cumle1==cumle2)//ikisinde de değerleri karşılastırı
            System.out.println("cumleler esit");
        else
            System.out.println("değil");

        if (cumle1.equals(cumle2))
            System.out.println("cumleler esit");
        else
            System.out.println("değil");

        //*********************Referans tipler***/

        // scanf ile ekrandan okunduğunda aşağıdaki gibi davranır
        String cumle3=new String("Bugun hava cok guzel");
        String cumle4=new String("Bugun hava cok guzel");


        if (cumle3==cumle4)//adresleri karşılaştırır(cumle3 ile cumle4 aynı mı)
            System.out.println("cumleler esit");
        else
            System.out.println("değil");

        if (cumle3.equals(cumle4))//değerleri aynı mı onu karşılastırır
            System.out.println("cumleler esit");
        else
            System.out.println("değil");



    }
}
