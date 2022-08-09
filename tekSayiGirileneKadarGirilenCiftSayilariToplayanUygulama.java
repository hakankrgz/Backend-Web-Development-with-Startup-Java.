package Giris;

import java.util.Scanner;

public class tekSayiGirileneKadarGirilenCiftSayilariToplayanUygulama {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp
        ekrana basan programı yazıyoruz.
        */
        Scanner inp = new Scanner(System.in);
        double number = 0;
        double total = 0;
        do {
            System.out.print("Sayı Girin: ");
            number = inp.nextDouble();
            if (number % 2 != 0) {
                System.out.println("Tek Olan Sayı: " + number);
                total += number;
            }
        } while (number > 0);
        System.out.println("Tek Sayıların Toplamı: " + total);

    }
}
