package gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_Soru {
    public static void main(String[] args) {
        HashMap<String,String> uCard=new HashMap<>();
        uCard.put("Name","Ugur Yilmaz");
        uCard.put("email","ugur@gmail.com");
        uCard.put("adres","Cekmekoy-Ist");
        uCard.put("Tel","123456789");

        System.out.println("uCard = " + uCard.get("Name"));
        System.out.println("uCard = " + uCard.get("Tel"));

        HashMap<String,String> aCard=new HashMap<>();
        aCard.put("Name","Doga Yuksel");
        aCard.put("email","doga@gmail.com");
        aCard.put("adres","Tuzla-Ist");
        aCard.put("Tel","987654321");

        HashMap<String, HashMap<String,String>> cards=new HashMap<>();

        cards.put("ugur", uCard);
        cards.put("doga", aCard);

        System.out.println("cards = " + cards.get("ugur"));

        System.out.println("cards = " + cards.get("doga"));

        System.out.println("doga adres = " + cards.get("doga").get("adres"));

        //only emails
        for (Map.Entry<String,HashMap<String,String>> kv:cards.entrySet())
        {
            System.out.println("emails = " + kv.getValue().get("email"));
        }



    }
}
