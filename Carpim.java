package Giris;

import java.util.Scanner;

public class Carpim {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı gir:");
        int n = inp.nextInt();

        for (int i = 1; i <= 20; i++) {
            int sonuc = i * n;
            System.out.println(n + "x" + i + "=" + sonuc);
        }
    }
}
