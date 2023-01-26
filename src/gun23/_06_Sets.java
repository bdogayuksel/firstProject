package gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);

        System.out.println("setB = " + setB);

        //BİRLEŞTİRME addAll
        HashSet<Integer> birlesik=new HashSet<>();
        birlesik.addAll(setA);
        birlesik.addAll(setB);
        System.out.println("birlesik = " + birlesik);

        //FARK remove
        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(setA);
        farki.remove(setB);//A dan B yi çıkardı
        System.out.println("farki = " + farki);


        //Kesişim kümesi retainAll
        HashSet<Integer> kesisim=new HashSet<>();
        kesisim.addAll(setA);
        kesisim.retainAll(setB);
        System.out.println("kesisim = " + kesisim);

    }
}
