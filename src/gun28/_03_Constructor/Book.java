package gun28._03_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    //BU DEĞERLERİ YAZDIKTAN SONRA
    // SAĞ CLICK GENERATE CONSTRUCTOR
    //OTOMATİK KENDİSİ YAZIYOR


    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    public Book() {
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
