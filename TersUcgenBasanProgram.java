package Giris;

import java.util.Scanner;

public class TersUcgenBasanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısı Girin: ");
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
