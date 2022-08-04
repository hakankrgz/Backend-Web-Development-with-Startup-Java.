package Giris;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, armutkg, elmakg, domateskg, muzkg, patlicankg, total;

        System.out.println("Armut KG girin: ");
        armutkg = girdi.nextDouble();
        System.out.println("Elma KG girin: ");
        elmakg = girdi.nextDouble();
        System.out.println("Domates KG girin: ");
        domateskg = girdi.nextDouble();
        System.out.println("Muz KG girin: ");
        muzkg = girdi.nextDouble();
        System.out.println("Patlıcan KG girin: ");
        patlicankg = girdi.nextDouble();

        total = (armut * armutkg) + (elma * elmakg) + (domates * domateskg) + (muz * muzkg) + (patlican * patlicankg);
        System.out.println("Toplam tutar: " + total);
    }
}
