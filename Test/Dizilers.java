package Giris.Test;

public class Dizilers {
    public static void main(String[] args) {
        int[][] matris={
                {31,13,156},
                {23,43,214}
        };

        for (int[] r: matris){
            for (int c: r){
                System.out.print(c + " ");
            }
            System.out.println();
        }


        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
