package gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] table={
                {4,55},
                {45,6,77},
                {4,2,999,45,56,66},
                {42,12,9},
                {4},
        };

        System.out.println("row number= "+ table.length);
        //SATIRDAKİ SÜTUN SAYISI ELEMAN SAYISINI VERİR
        System.out.println("0.satırdakı sütun sayısı= "+ table[0].length);
        System.out.println("1.satırdaki sütun sayısı= "+ table[1].length);
        System.out.println("2.satırdaki sütun sayısı= "+ table[2].length);
        System.out.println("3.satırdaki sütun sayısı= "+ table[3].length);
        System.out.println("4.satırdaki sütun sayısı= "+ table[4].length);

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
