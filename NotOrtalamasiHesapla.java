package Giris;

import java.util.Scanner;

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        /*Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin -6-
        puanlarını alan ve ortalamasını hesaplayan program.*/

        //Değişkenleri oluştur.
        int mat, fizik, kimya, tarih, muzik, turkce;

        //Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.print("Ortalamanız: " + sonuc);
        System.out.print(" - ");

        String durum = (sonuc >= 60) ? "Geçtiniz!" : "Kaldınız!";
        System.out.println(durum);
    }
}