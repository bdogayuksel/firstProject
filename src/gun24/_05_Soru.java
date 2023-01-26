package gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz. Method ile)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış
        Map<String, String> sozluk= new TreeMap<>();
        Scanner input=new Scanner(System.in);
        int secim=0;


        do {
            System.out.println("MENU\n1- EKLEME\n2- DUZELTME\n3- LISTELEME\n4- ARAMA\n5- SILME\n6- Cikis");
            secim=input.nextInt();

            switch (secim){

                case 1:
                    System.out.println("Kelime gir: ");
                    String kelime=input.nextLine();
                    System.out.println("Anlamı: ");
                    String anlam=input.nextLine();

                    sozluk.put(kelime, anlam);

                    break;
                case 2:
                    System.out.println("düzeltme");
                    break;
            }

        }while (secim!=6);

    }
}
