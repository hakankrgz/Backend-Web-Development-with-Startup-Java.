package Giris.Giris;

import java.util.*;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int dogumyili = 0, sonuc;
        String burc = "";
        System.out.print("Doğum Yılınızı Girin: ");
        try {
            dogumyili = inp.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lütfen Sadece Sayı Girin!");
            System.exit(0);
        }
        sonuc = dogumyili % 12;
        switch (sonuc) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("BİR ŞEYLER TERS GİTTİ :( ");
                System.exit(0);
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
