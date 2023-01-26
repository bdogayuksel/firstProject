package gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // \n =>alt satıra geçirir
        // \t => tab a basılmış gibi yapar
        // \b => backspace özelliği gösterir
        // \" -> " " koymak için kullanılır
        // \\ => \ basmak için kullanılır
        // \r => ondan önceki her şeyi siler
        System.out.println("amk\tdünyası");//amk	dünyası
        System.out.println("amk\bdünyası");//amdünyası
        System.out.println("amk\"dünyası");//amk"dünyası
        System.out.println("amk\\dünyası");//amk\dünyası
        System.out.println("amk\rdünyası");//dünyası
    }
}
