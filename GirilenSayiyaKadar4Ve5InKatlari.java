package Giris;

import java.util.Scanner;

public class GirilenSayiyaKadar4Ve5InKatlari {
    public static void main(String[] args) {
        /*
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
         * kuvvetlerini ekrana yazdıran programı yazıyoruz.
         * */
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number Limit: ");
        double number = inp.nextDouble();
        for (double i = 1; i <= number; i *= 4) {
            System.out.println(number + "'a kadar, 4'ün Kuvvetleri: " + i);
        }
        System.out.println("-----------------------------");
        for (double x = 1; x <= number; x *= 5) {
            System.out.println(number + "'a kadar 5'in Kuvvetleri: " + x);
        }
    }
}
