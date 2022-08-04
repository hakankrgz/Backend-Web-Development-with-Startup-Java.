package Giris;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        int select;
        System.out.print("İlk Sayıyı Girin: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Girin: ");
        n2 = input.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yukarıdan Yapmak İstediğiniz İşlem Numarasını Seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Herhangi bir sayı 0'a bölünemez!");
                } else {
                    System.out.println("Sonuç: " + (n1 / n2));
                }
                break;
        }
    }
}
