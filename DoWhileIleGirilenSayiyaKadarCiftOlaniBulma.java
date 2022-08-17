package Giris;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhileIleGirilenSayiyaKadarCiftOlaniBulma {
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
        int i=1;
        while (i <= sayi) {
            if (i % 2 == 0) {
                System.out.println("Çift Sayı: " + i);
            }
            ++i;
        }

    }
}
