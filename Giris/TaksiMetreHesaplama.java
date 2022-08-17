package Giris.Giris;

import java.util.Scanner;

public class TaksiMetreHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double perKm = 6.30, km, total, startPrice = 28;

        System.out.print("Gidilen KM Giriniz: ");
        km = girdi.nextDouble();

        total = perKm * km;
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}
