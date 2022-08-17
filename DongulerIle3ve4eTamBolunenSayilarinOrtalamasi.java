package Giris;

import java.util.Scanner;

public class DongulerIle3ve4eTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı Girin: ");
        double sayi = inp.nextDouble();
        double total = 0;
        double tane = 0;

        for (double i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println("3'e veya 4'e Tam Bölünen Sayı: " + i);
                tane += 1;
                System.out.println("Kaçıncı Sayı: " + tane);
                total += i;
                System.out.println("Total: " + total);
                System.out.println("Ortalama: " + (total / tane));
            }
        }
    }
}
