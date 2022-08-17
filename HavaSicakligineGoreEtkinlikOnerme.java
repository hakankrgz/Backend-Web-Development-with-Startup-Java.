package Giris;

import java.util.Scanner;

public class HavaSicakligineGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double sicaklik;
        System.out.println("Hava sıcaklığını girin: ");
        sicaklik = inp.nextDouble();

        if (sicaklik < 5) {
            System.out.println("Kayak yap!");
        } else if ((sicaklik > 5) && (sicaklik < 15)) {
            System.out.println("Sinemaya git!");
        }else if ((sicaklik > 15) && (sicaklik < 25)){
            System.out.println("Piknik yap!");
        } else if (sicaklik > 25) {
            System.out.println("Havuza git!");
        }
        }
    }
