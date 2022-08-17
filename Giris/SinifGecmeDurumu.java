package Giris.Giris;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double mat, fizik, kimya, muzik, turkce;

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextDouble();
        System.out.print("Fizik  notunuzu giriniz: ");
        fizik = inp.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextDouble();
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextDouble();

        double average = (mat + fizik + kimya + muzik + turkce) / 5;

        if (average > 50) {
            System.out.println("Tebrikler geçtiniz! Notunuz:" + average);
        } else {
            System.out.println("Kaldınız! Notunuz:" + average);
        }
    }
}
