package gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001,"Dog yuksel");
        hm.put(1002,"Doga yuksel");
        hm.put(1003,"berk yuksel");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k:hm.keySet())//KEYS
        {
            System.out.println(k+"\t");
        }

        System.out.println();

        for (String str:hm.values()){//VALUES
            System.out.println(str+"\t");
        }

        System.out.println();

        for (Map.Entry<Integer, String> kv:hm.entrySet()){//HEM KEYS HEM VALUE YU BASAR
            System.out.println(kv.getKey()+" "+ kv.getValue());

        }
    }

}
