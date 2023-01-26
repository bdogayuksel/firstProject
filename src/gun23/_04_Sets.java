package gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);

        System.out.println("hs = " + hs.size());

        hs.remove(5);//INDEX E GÖRE DEĞİL ELEMAN DEĞERİNE GÖRE SİLER
        System.out.println("new hs = " + hs);

        if(hs.contains(7)){//CONTAINS VAR MI YOK MU
            System.out.println("var");
        }
        
        else
            System.out.println("yok");
        
        hs.clear();//İÇİNİ BOŞALTIR
        System.out.println("hs = " + hs);
    }
}
