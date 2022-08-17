package Giris.Giris;

import java.util.*;

public class WhileIleGirilenSayiyaKadarCiftOlaniBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double sayi = 0;
        System.out.println("Bir Sayı Girin: ");
        try {
            sayi = inp.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Geçersiz Değer Girişi!");
            System.exit(0);
        }
        double i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println("Çift Sayı: " + i);
            }
            ++i;
        } while (i <= sayi);
        System.out.println("SAYI: " + sayi + "\n İ: " + i);
    }
}
