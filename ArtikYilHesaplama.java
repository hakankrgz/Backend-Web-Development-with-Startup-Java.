package Giris;

import java.util.*;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double yil = 0;
        System.out.println("Yıl Girin: ");
        try {
            yil = inp.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Geçersiz Değer Girdiniz!");
            System.exit(0);
        }finally {
            System.out.println("Değer Kabul Edildi.");
        }
        double kalan = yil % 4;
        String sonuc = "";
        if (kalan == 0) {
            sonuc = "Artık Yıldır.";
        } else {
            sonuc = "Artık Yıl Değildir.";
        }
        System.out.println(sonuc);
    }
}
