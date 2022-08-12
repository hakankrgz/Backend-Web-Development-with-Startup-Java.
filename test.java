package Giris;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int entry = 3;
        int select;
        double bakiye = 3200, yatan, cekilen;
        while (entry > 0) {
            System.out.println("******************");
            System.out.print("Enter Username: ");
            userName = inp.nextLine();
            System.out.println("******************");
            System.out.print("Enter Password: ");
            password = inp.nextLine();
            if (userName.equals("hakan03300") && password.equals("1453")) {
                System.out.println("||||||||||||||||||||");
                System.out.println("Kullanıcı Bulundu!");
                System.out.println("||||||||||||||||||||");

                break;
            } else {
                System.out.println("Hatalı Giriş!\nKalan Hakkınız: " + --entry + "\n\n");
            }
            if (entry == 0) {
                System.out.println("Giriş Reddedildi!");
                System.exit(0);
            }
        }
        try {

            do {

                System.out.println("Bakiye Sorgulama => 1\nPara Yatırma => 2\nPara Çekme => 3\nÇıkış => 4");
                System.out.print("Merhaba! Lütfen işlem seçin => ");
                select = inp.nextInt();
                switch (select) {
                    case 1:
                        System.out.println(" --------------------- ");
                        System.out.println("   Bakiye: " + bakiye);
                        System.out.println(" --------------------- ");
                        break;
                    case 2:
                        System.out.print("Yatırılan Tutar Girin: ");
                        yatan = inp.nextDouble();
                        bakiye += yatan;
                        System.out.println(" --------------------- ");
                        System.out.println("Güncel Bakiye: " + bakiye);
                        System.out.println(" --------------------- ");
                        break;
                    case 3:
                        System.out.print("Çekilen Tutar Girin: ");
                        cekilen = inp.nextDouble();
                        bakiye -= cekilen;
                        System.out.println(" --------------------- ");
                        System.out.println("Güncel Bakiye: " + bakiye);
                        System.out.println(" --------------------- ");
                        break;
                    case 4:
                        System.out.println(" --------------------- ");
                        System.out.println("       Hoşçakal!");
                        System.out.println(" --------------------- ");
                        break;
                    default:
                        System.out.println(" --------------------- ");
                        System.out.println("Geçersiz Değer Girdiniz!");
                        System.out.println(" --------------------- ");
                }

            } while (select != 4);
        }catch (InputMismatchException e){
            System.out.println("Geçersiz Değer Girişi");
        }
    }
}
