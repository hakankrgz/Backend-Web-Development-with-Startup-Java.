package Giris;

import java.util.Scanner;

public class RecursiveDeseneGoreMetotOlusturma {

    static int dongu(int n) {
        if (n > 5) {
            System.out.print(n + " ");
            return dongu(n - 5);
        }
        System.out.print(n + " ");
        return 0;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Sayı Girin: ");
        n = inp.nextInt();

        dongu(n);
    }
}
