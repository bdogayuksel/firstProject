package Gun15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
       // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
       //  *****
       //  *****
       //  *****
       //  *****
       //  *****

        for (int i=0; i<5; i++){
            for (int a=0;a<5;a++){
                System.out.print("*");
            }
            System.out.println("*");
        }

        /*for(int satir=0; satir<5;satir++) {  //satir=0, 1,2,3,4

            for (int i = 0; i < 5; i++) { //ahmet=0,1,2,3,4
                System.out.print("*");
            }

            System.out.println();

        }*/

    }
}
