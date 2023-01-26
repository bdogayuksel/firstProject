package gun28._02_ConstructorMethods;

public class Book {//BOOK CLASS I

    String name;
    int publishYear;
    String author;

    public Book(){//BOOK CONSTRUCTOR METHODLARI U VE ALTINDAKİ MTHODLAR

        System.out.println("Book has been created");
    }

    public Book(String name, int publishYear, String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }

    public Book(String name, int publishYear){
        this(name,publishYear,"");
    }

    public String toString(){//hepsini tek satırda yazmak çin toSring kullandık


        return name+" "+publishYear+" "+author;
    }

    public void oneLine(){
        System.out.println(name+" "+publishYear+" "+author);
    }

}
