package gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //SET-> HashSet, LinkedHashSet TreeSet
        //MAP> HashMap, LinkedHashMap, TreeMap
        //Map=Anahtar+Set-> Anahtarlı set
        //KEYLER UNIQE

        //anahtarın tip Iteger, değerinin tipi String olsun
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001,"Dog yuksel");
        hm.put(1002,"Doga yuksel");
        hm.put(1003,"berk yuksel");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(1002) = " + hm.get(1002));

        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(1003);//istenen elemanı siler(key ve set beraber silinir)Anahtar ile silme yapar

        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();//tümünü siler
        System.out.println("hm = " + hm);

    }
}
