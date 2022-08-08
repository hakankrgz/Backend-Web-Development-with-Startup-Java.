package Giris;

import java.util.*;

public class AirplaneTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    double mesafe =5;
        System.out.print("KM cinsinden mesafe girin: ");
            mesafe = inp.nextDouble();
        double mesafetutari = mesafe * 0.10, yasindirimli, yasindirimi, ciftyonindirimi, ciftyonindirimli;

        if (mesafe > 0) {

        } else if (mesafe < 0) {
            System.out.println("Hatalı Mesafe Girildi!");
            System.exit(0);
        } else {
            System.out.println("Hatalı Giriş Türü!");
            System.exit(0);
        }

        System.out.print("Yaşınızı girin: ");
        int yas = inp.nextInt();

        if (yas >= 0) {

        } else {
            System.out.println("Hatalı Yaş Girdiniz!");
            System.exit(0);
        }

        System.out.println("Yolculuk tipi seçin.\n1=>Tek yön.\n2=>Çift yön.");
        int tip = inp.nextInt();

        if ((tip == 1) || (tip == 2)) {

        } else {
            System.out.println("Hatalı Girdiniz!");
            System.exit(0);
        }

        if (((tip == 1) || (tip == 2)) && (yas >= 0) && (mesafe > 0)) {
            if (yas <= 12) {
                yasindirimi = mesafetutari * 0.05;
                yasindirimli = mesafetutari - yasindirimi;
                System.out.println("Yaş İndirimi: " + yasindirimi);
                System.out.println("Yas İndirimli Fiyat: " + yasindirimli);
                if (tip == 2) {
                    ciftyonindirimi = yasindirimli * 0.2;
                    ciftyonindirimli = yasindirimli - ciftyonindirimi;
                    System.out.println("Çift Yön İndirimi: " + ciftyonindirimi);
                    System.out.println("Yas ve Çift Yön İndirimli Ödenecek Fiyat: " + ciftyonindirimli);
                } else if (tip == 1) {
                    System.out.println("Yas İndirimli, Tek Yön, Ödenecek Fiyat: " + yasindirimli);
                }
            } else if ((yas > 12) && (yas <= 24)) {
                yasindirimi = mesafetutari * 0.10;
                yasindirimli = mesafetutari - yasindirimi;
                System.out.println("Yaş İndirimi: " + yasindirimi);
                System.out.println("Yas İndirimli Fiyat: " + yasindirimli);
                if (tip == 2) {
                    ciftyonindirimi = yasindirimli * 0.2;
                    ciftyonindirimli = yasindirimli - ciftyonindirimi;
                    System.out.println("Çift Yön İndirimi: " + ciftyonindirimi);
                    System.out.println("Yas ve Çift Yön İndirimli Ödenecek Fiyat: " + ciftyonindirimli);
                } else if (tip == 1) {
                    System.out.println("Yas İndirimli, Tek Yön, Ödenecek Fiyat: " + yasindirimli);
                }
            } else if (yas >= 65) {
                yasindirimi = mesafetutari * 0.30;
                yasindirimli = mesafetutari - yasindirimi;
                System.out.println("Yaş İndirimi: " + yasindirimi);
                System.out.println("Yas İndirimli Fiyat: " + yasindirimli);
                if (tip == 2) {
                    ciftyonindirimi = yasindirimli * 0.2;
                    ciftyonindirimli = yasindirimli - ciftyonindirimi;
                    System.out.println("Çift Yön İndirimi: " + ciftyonindirimi);
                    System.out.println("Yas ve Çift Yön İndirimli Ödenecek Fiyat: " + ciftyonindirimli);
                } else if (tip == 1) {
                    System.out.println("Yas İndirimli, Tek Yön, Ödenecek Fiyat: " + yasindirimli);
                }
            } else if ((yas > 24) && (yas < 65)) {
                System.out.println("Normal Fiyat: " + mesafetutari);
                if (tip == 2) {
                    ciftyonindirimi = mesafetutari * 0.2;
                    ciftyonindirimli = mesafetutari - ciftyonindirimi;
                    System.out.println("Çift Yön İndirimi: " + ciftyonindirimi);
                    System.out.println("Çift Yön İndirimli Ödenecek Fiyat: " + ciftyonindirimli);
                } else if (tip == 1) {
                    System.out.println("Tek Yön, Normal Fiyat: " + mesafetutari);
                }
            }
        } else {
            System.out.println("Bir şeyler ters gitti :(");
        }

    }
}
