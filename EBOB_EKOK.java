package Giris;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select = 1;
        int ebobn1 = 0;
        int ebobn2 = 0;
        int ebobcikis = 0;
        int ekokn1 = 0;
        int ekokn2 = 0;
        int ekokcikis = 0;
        boolean exit = true;
        boolean mainexit = true;
        do {
            System.out.println("EKOK HESAPLAMA İÇİN => 1'E BASIN\nEBOB HESAPLAMAK İÇİN => 2'YE BASIN");
            try {
                select = inp.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz Değer Girişi!");
                System.exit(0);
            }
            switch (select) {
                case 1:
                    do {
                        System.out.print("1. SAYIYI GİRİN: ");
                        try {
                            ekokn2 = inp.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Geçersiz Değer Girişi");
                            System.exit(0);
                        }
                        System.out.print("2. SAYIYI GİRİN: ");
                        try {
                            ekokn1 = inp.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Geçersiz Değer Girişi");
                            System.exit(0);
                        }
                        for (int i = 2; i <= (ekokn1 * ekokn2); i++) {
                            if (i % ekokn1 == 0 && i % ekokn2 == 0) {
                                System.out.println(i);
                                break;
                            }
                        }
                        System.out.println("Çıkmak İçin 0'a Devam Etmek İçin 1'e Basın: ");
                        ekokcikis = inp.nextInt();
                        switch (ekokcikis) {
                            case 1:
                                break;
                            case 0:
                                exit = false;
                                break;
                            default:
                                System.out.println("Geçersiz Değer Girişi");
                                System.exit(0);
                        }
                    } while (exit);
                    break;
                case 2:
                    do {
                        System.out.print("1. SAYIYI GİRİN: ");
                        try {
                            ebobn2 = inp.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Geçersiz Değer Girişi");
                            System.exit(0);
                        }
                        System.out.print("2. SAYIYI GİRİN: ");
                        try {
                            ebobn1 = inp.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Geçersiz Değer Girişi");
                            System.exit(0);
                        }

                        int ebob = 1;
                        if (ebobn2 >= ebobn1) {
                            for (int i = 1; i <= ebobn1; i++) {
                                if (ebobn2 % i == 0 && ebobn1 % i == 0) {
                                    ebob = i;
                                }
                            }
                            System.out.println(ebob);

                        } else {
                            for (int i = 1; i <= ebobn2; i++) {
                                if (ebobn2 % i == 0 && ebobn1 % i == 0) {
                                    ebob = i;
                                }
                            }
                            System.out.println(ebob);
                        }
                        System.out.println("ÇIKMAK İÇİN 0'A, DEVAM ETMEK İÇİN 1'E BASIN");
                        try {
                            ebobcikis = inp.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Geçersiz Değer Girişi!");
                        }
                        switch (ebobcikis) {
                            case 1:
                                break;
                            case 0:
                                exit = false;
                        }
                    } while (exit);
                    break;
            }

            System.out.println("Programdan Çıkmak İçin 0'a Devam Etmek İçin 1'e Basın: ");
            try {
                ekokcikis = inp.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz Değer Girişi!");
            }
            switch (ekokcikis) {
                case 1:
                    break;
                case 0:
                    mainexit = false;
                    break;
                default:
                    System.out.println("Geçersiz Değer Girişi!");
                    System.exit(0);
            }
        } while (mainexit);
    }
}