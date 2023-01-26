package gun39._02_OOP_Ornek;

public class ABMain {
    public static void main(String[] args) {
        //MESAJ STTAIC OLDUĞU İÇİN HEP EN SON DEĞERİ BASAR

        A a=new A();
        System.out.println("A.message = " + A.message);//A dan merhaba

        B b=new B();
        System.out.println("A. = " + A.message);//B den merhaba

        A a2=new A();//BUNUN Bİ ETKİSİ OLMADI
        System.out.println("A.message = " + A.message);//B den merhaba
    }
}
