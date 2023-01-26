package gun28._02_ConstructorMethods;

public class Kitapci {
    public static void main(String[] args) {


        Book book1=new Book();
        book1.name="kasdas";
        book1.author="dqdq";
        book1.publishYear=1002;


        Book book2=new Book("AMK",198,"ADAS");

        Book book3=new Book("kaka",1929);
        System.out.println(book1.name);
        System.out.println(book3.author);

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);



    }
}
