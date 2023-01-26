package gun09;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        //**I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String str="I love java";
        int len=str.length();
        System.out.println("len = " + len);

        //**Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String str1="Sprint planning";
        int len1=str1.length();
        System.out.println("len1 = " + len1);

        //**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**

        String str2="apple";
        boolean varMı=str2.contains("app");
        System.out.println("varMı = " + varMı);

        //**orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String str3="orange";
        boolean esitMi=str3.equals("Apple");
        System.out.println("esitMi = " + esitMi);

        //**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._

        String str4="apple";
        boolean ayniMi=str4.equalsIgnoreCase("Apple");
        System.out.println("ayniMi = " + ayniMi);

        //**Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String str5="Florida";
        int count=str5.indexOf("o");
        System.out.println("count = " + count);

        //**Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String str6="Thank you";
        int count1=str6.indexOf("y");
        System.out.println("count1 = " + count1);

        //**Main method** oluşturun.(YUKARIDA)
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String str7="Mouse";
        char karak= str7.charAt(3);
        System.out.println("karak = " + karak);
        
        
        //**paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE
        
        String str8="paper";
        System.out.println("str8.toUpperCase() = " + str8.toUpperCase());

        //**OraNge** olan bir String oluşturun. 
        //String'i _küçük harfe_ çevirin ve yazdırın. 
        //örn: APPLE > apple
        
        String str9="OraNge";
        System.out.println("str9.toLowerCase() = " + str9.toLowerCase());


        //**New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String str10="New Jersey";
        System.out.println("str10.toUpperCase() = " + str10.toUpperCase());

        //**New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.
        
        String str11="New York";
        System.out.println("str11.toLowerCase() = " + str11.toLowerCase());

        //**PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        
        String str12="PADDLE";
        System.out.println("str12.toLowerCase() = " + str12.toLowerCase());


        //ÖZEL SORULAR

        //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        String name="Doga";
        String surname="Yuksel";
        System.out.println("Full Name= "+ name.concat(" ").concat(surname));

        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        
        String a="Merhaba";
        System.out.println("a.isEmpty() = " + a.isEmpty());

        //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)
        Scanner sc=new Scanner(System.in);
        System.out.print("Cumle gir: ");
        String cumle=sc.nextLine();

        String[] parca=cumle.split("");

        int count2=0;

        for(int i=0;i<cumle.length();i++){
            if(parca[i].equals("a"))
                count2++;
        }
        System.out.println("Toplam A sayısı = "+count2);

        //4- girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner sc1=new Scanner(System.in);
        System.out.print("cumle gir: ");
        String text= sc1.nextLine();
        int uzunluk= text.length();
        char sonHarf=text.charAt(uzunluk-1);

        System.out.println("ilk harf: "+text.charAt(0)+" Son harf: "+sonHarf);

        //5- girilen bir cümledeki ilk kelimeyi yazdırınız
        System.out.print("cumle gir: ");
        String text1=sc1.nextLine();
        String[] strLis =text1.split(" ");//kelimeleri space e göre bölüp array içine attık
        System.out.println("ilk kelime: "+ strLis[0]);//arraydeki ilk elemanı bastırdık

        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız
        System.out.print("cumle gir: ");
        String text2=sc1.nextLine();
        String[] strList =text2.split(" ");
        String firstTwoWords=strList[0]+strList[1];
        System.out.println("First two words: "+strList[0]+" "+strList[1]);

        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        System.out.print("enter a sentence: ");
        String text3=sc1.nextLine();
        String[] strlist1=text3.split(" ");
        int arrayUzunluk=strlist1.length;
        System.out.println("kelime sayısı: "+arrayUzunluk);

        //8- Girilen bir cumledeki kelimelerin ilk harflerini hazdırınız
        System.out.println("enter a sentence: ");
        String text4=sc1.nextLine();
        String[] strlist2=text4.split(" ");
        for (int i = 0; i < strlist2.length; i++) {
            String s = strlist2[i];
            System.out.println(s.charAt(0));
        }

        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        System.out.println("enter a your name: ");
        String text5=sc1.nextLine();
        String[] strlist3=text5.split(" ");
        for (int i = 0; i < strlist3.length; i++) {
            String s = strlist3[i];
            System.out.println(s.charAt(0));
        }






    }
}
