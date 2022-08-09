package Giris;

import java.util.Scanner;

public class TekSayiGirileneKadarCiftVe4unKatlariniToplayanUygulama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden çift ve 4'ün
        katları olan sayıları toplayıp ekrana basan programı yazıyoruz
        */
        double number;
        double total = 0;
        do {
            System.out.println("Enter Number: ");
            number = inp.nextDouble();
            if (number % 2 == 0 && number % 4 == 0) {
                System.out.println("Girilen Sayı Çift ve 4'ün Kartıdır: " + number);
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("Toplam: " + total);
    }
}
