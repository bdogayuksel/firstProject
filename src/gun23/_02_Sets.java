package gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS
        //HashSet: Hızlı, bunnu için kendine göre algoritmik sırada tutar
        //LinkedHashSet: EKLEME SIRASINA göre sıralı tutar
        //TreeSet: her zaman içinde SIRALI şekilde tutar, kendinden sortlu

        HashSet<String> hs=new HashSet<>();//kendi algoritmasına göre basar

        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("bes");
        System.out.println("hs = " + hs);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();//eklenme sırasına göre basar
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts= new TreeSet<>();//Hard ısrasına göre basar
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts = " + ts);
    }
}
