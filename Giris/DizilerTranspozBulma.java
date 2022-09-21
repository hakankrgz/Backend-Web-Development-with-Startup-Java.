package Giris.Giris;

import java.util.Scanner;

public class DizilerTranspozBulma {    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Satır sayısını giriniz: ");
    int row = scanner.nextInt();
    System.out.println("Sütun sayısını giriniz: ");
    int col = scanner.nextInt();

    int[][] matris = new int[row][col];
    int[][] transpose = new int[col][row];

    for (int i = 0; i < matris.length; i++){
        for (int j = 0; j < matris[i].length; j++){
            System.out.print("Satır : " + i + " - Sütun: " + j + " elemanı giriniz: ");
            matris[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < matris.length; i++){
        for (int j = 0; j < matris[i].length; j++){
            transpose[j][i] = matris[i][j];
        }
    }

    for (int i = 0; i < transpose.length; i++){
        for (int j = 0; j < transpose[i].length; j++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
}
}
