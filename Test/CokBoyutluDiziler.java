package Giris.Test;

public class CokBoyutluDiziler {
    public static void main(String[] args) {

        int[][] table = new int[][]{
                {32, 12, 34, 65},
                {45, 33, 13, 54},
                {27, 76, 53, 75},
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
