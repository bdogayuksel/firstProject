package gun06;

public class _09_StringTrim {
    public static void main(String[] args) {
        //TRIM: String'in başındaki ve sonundaki boşlukları yok sayar.

        String text="     hello world         ";


        System.out.println("text = ->" + text+"<-");
        System.out.println("text = ->  " + text.trim()+"<-");
    }
}
