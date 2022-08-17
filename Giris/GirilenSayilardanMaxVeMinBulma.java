package Giris.Giris;

import java.util.Scanner;

public class GirilenSayilardanMaxVeMinBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max = 1;
        int min = 1;
        System.out.print("Kaç Tane Sayı Gireceksiniz? ");
        int s = inp.nextInt();
        for (int i = 1; i <= s; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int n = inp.nextInt();

            if (i == 1) {
                min = n;
                max = n;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Max Değer: " + max);
        System.out.println("Min Değer: " + min);
    }
}
