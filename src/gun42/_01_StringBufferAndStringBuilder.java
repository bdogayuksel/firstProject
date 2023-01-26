package gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle+="bugun";
        cumle+=" hava";
        cumle+=" cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle = " + cumle.concat(" dün sıcaktı"));
        System.out.println("cumle = " + cumle);//YUKARIDA EKLEMEMİZE RAGMEN DEĞİŞMEDİ
        //DOĞRUDAN VARIABLE A EKLENMELİ
        cumle=cumle.concat(" dün sıcaktı");
        System.out.println("cumle = " + cumle);

        /************StrinBuilder***********/

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("bugun ");
        cumle2.append("hava ");
        cumle2.append("soguk");

        System.out.println("cumle2 = " + cumle2);


/***************+, Concat, StringBuilder zaman kıyası***********/
        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10; i++) {
            test1+="Merhaba";
        }

        System.out.println("+ için harcanan süre"+ (System.currentTimeMillis()-startTime));

        startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10; i++) {
            test2=test2.concat("Merhaba");
        }

        System.out.println("concat için harcanan süre"+ (System.currentTimeMillis()-startTime));

        startTime=System.currentTimeMillis();

        StringBuilder test3=new StringBuilder();
        for (int i = 0; i <10; i++) {
            test3=test3.append("Merhaba");

        }

        System.out.println("StringBuilder için harcanan süre"+ (System.currentTimeMillis()-startTime));

        //TEST SONUCU:
        // eğer 3 e kadar eklenecekse + kulanlılır
        //10 adede kadar concat
        //10+ için String builder en verimli


        StringBuilder sb=new StringBuilder();
        sb.append("Bugun ");
        sb.append("hava ");
        sb.append("guzel");
        System.out.println("sb = " + sb);

        sb.reverse();//string i ters çevirir
        System.out.println("sb ters= " + sb);
        sb.reverse();
        sb.delete(0,5);//başlangıç değeri dahil final değeri değil
        System.out.println("sb silinmiş hali= " + sb);

        sb.deleteCharAt(3);//sadece yazılan indexdeki değeri siler
        System.out.println("sb belirli index silinmiş = " + sb);

        sb.insert(0,"bugun ");//istenen indexe istenen stringi ekler
        System.out.println("sb eklenmiş = " + sb);

        sb=new StringBuilder("Bugün hava çok soğuk");//sıfırlar ve yeni değer atanır
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu");//aralığı verilen string ile değiştir
        System.out.println("sb = " + sb);

        String strSb=sb.toString();


        StringBuffer sBuffer=new StringBuffer();
        //StringBuilder ile aynı
        //paralel çalışan yazılımlarda kullanılır
    }

}



