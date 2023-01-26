package gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] array=new int[5];
        int[] array2={5,3,6,75};

        String[] words= new String[5];
        boolean[] array3=new boolean[3];//3 tane t/f saklayabile dizi
        double[] oranlar= new double[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("array = " + array[i]);
        }

        for (int i =  0; i <words.length ; i++) {

            System.out.println("words = " + words[i]);

        }

        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println("array3 = " + array3[i]);
        }
    }
}
