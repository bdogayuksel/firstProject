package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int i=1;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i=5;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        /*for(int satir=1;satir<=5;satir++){

            for(int j=0;j<satir;j++)
                System.out.print("*");

            System.out.println();
        }


        for(int satir=5;satir>0;satir--){

            for(int j=0;j<satir;j++) {
                System.out.print("*");
            }

            System.out.println();

        }*/


    }
}
