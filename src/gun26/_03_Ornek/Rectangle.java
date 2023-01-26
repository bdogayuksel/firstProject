package gun26._03_Ornek;

public class Rectangle {
    int width;
    int length;

    public void cevre(){

        int c=2*(width+length);
        System.out.println("cevre: "+ c);
    }

    public void alan(){
        int a=width*length;
        System.out.println("alan: "+a);
    }
}
