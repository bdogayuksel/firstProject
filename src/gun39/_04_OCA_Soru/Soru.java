package gun39._04_OCA_Soru;



class C{//DEDE
    public C() {
        System.out.println("C");
    }
}

class B extends C{//BABA
    public B() {
        System.out.println("B");
    }
}

class A extends B{//TORUN
    public A() {
        //super(); ilk super constructor çalışır
        // komutun üstünde gizli süper var
        //bu butun claslarda böyle
        //bu yüzden sıra C-B-A OLUR
        System.out.println("A");
    }
}
public class Soru {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a = " + a);
    }
}
