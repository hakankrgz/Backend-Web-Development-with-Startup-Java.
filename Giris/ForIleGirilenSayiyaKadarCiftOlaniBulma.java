package Giris.Giris;

import java.util.Scanner;

public class ForIleGirilenSayiyaKadarCiftOlaniBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        double sayi = inp.nextDouble();

        for (double i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println("Çift Sayı=> " + i);
            }
        }
    }
}
