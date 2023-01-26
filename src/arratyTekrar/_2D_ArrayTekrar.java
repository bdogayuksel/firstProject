package arratyTekrar;

public class _2D_ArrayTekrar {
    public static void main(String[] args) {

        int [][] tablo3= new int[2][3];

        tablo3[0]=new int[]{2,3,4,5,6};
        tablo3[1]=new int[]{2,3};

        int tablo4 [][]=new int[2][3];

        System.out.println("tablo3 = " + tablo3.length);
        System.out.println("tablo3 = " + tablo3[0].length);
        System.out.println("tablo3 = " + tablo3[1].length);

        for (int i = 0; i < tablo3.length; i++) {//i: 0,1

            for (int j  = 0; j <tablo3[i].length ; j++) {//önce tablo[0] 5,
                //sonra tablo[1] 2 //length

                System.out.println(tablo3[i][j]+" ");
            }

            System.out.println();

        }

        System.out.println("*************************");

        for (int [] satir:tablo3) {

            for(int eleman:satir){//satırın elemanları yani int yanisayı
                System.out.println(eleman+" ");
            }
            System.out.println();
        }

        for (int[] satir:tablo3){
            //1.adımda satır 2,3,4,5,6, aşağıdaki döngü sadece 2,3 ü yazar
            //2.adımda satır 2,3        aşağıdaki döngü satırın tamamını yani 2,3

            for (int i = 0; i < tablo3.length; i++) {

                System.out.println(satir[i]);

            }

            System.out.println();
        }
    }
}