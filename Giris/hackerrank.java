package Giris.Giris;

import java.util.Scanner;

public class hackerrank {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int us = 0; us < n; us++) {
                a += b * Math.pow(2, us);
                System.out.print(a + " ");
            }
        }
    }
}
