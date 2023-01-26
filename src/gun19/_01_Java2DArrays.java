package gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        //int[][] tablo=new int[2][3];//2 satır 3 sütun
        int[][] tablo={
                {3,4,55},
                 {5,10,15}
        };
        System.out.println("satır uzunluğu= "+ tablo.length);
        System.out.println("0.satırın sütun uzunluğu= "+ tablo[0].length);
        System.out.println("1.satırın sütun uzunluğu= "+tablo[1].length);

        for (int i = 0; i < tablo.length; i++) {//SATIR UUZNLUĞU

            for (int j = 0; j < tablo[i].length; j++) {//İLGİLİ SATIRDAKİ SÜTUN UZUNLUĞU
                System.out.print(tablo[i][j]+ "\t");
            }

            System.out.println();
        }

    }
}
