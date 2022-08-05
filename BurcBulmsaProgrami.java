package Giris;

import java.util.Scanner;

public class BurcBulmsaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
/*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
*/
        int ay, gun;
        String burc = "";
        boolean isError = true;

        System.out.println("Doğdunuz ay: ");
        ay = inp.nextInt();
        System.out.println("Doğduğunuz gün: ");
        gun = inp.nextInt();

        if (ay == 1) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 21) {
                    burc = "Oğlak";
                } else {
                    System.out.println("Kova");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 2) {
            if ((gun >= 1) && (gun <= 28)) {
                if (gun <= 19) {
                    System.out.println("Kova");
                } else {
                    System.out.println("Balık");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 3) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 20) {
                    System.out.println("Balık");
                } else {
                    System.out.println("Koç");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 4) {
            if ((gun >= 1) && (gun <= 30)) {
                if (gun <= 20) {
                    System.out.println("Koç");
                } else {
                    System.out.println("Boğa");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 5) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 22) {
                    System.out.println("Boğa");
                } else {
                    System.out.println("İkizler");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 6) {
            if ((gun >= 1) && (gun <= 30)) {
                if (gun <= 22) {
                    System.out.println("İkizler");
                } else {
                    System.out.println("Yengeç");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 7) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 23) {
                    System.out.println("Yengeç");
                } else {
                    System.out.println("Aslan");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 8) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 23) {
                    System.out.println("Aslan");
                } else {
                    System.out.println("Başak");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 9) {
            if ((gun >= 1) && (gun <= 30)) {
                if (gun <= 23) {
                    System.out.println("Başak");
                } else {
                    System.out.println("Terazi");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 10) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 23) {
                    System.out.println("Terazi");
                } else {
                    System.out.println("Akrep");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 10) {
            if ((gun >= 1) && (gun <= 31)) {
                if (gun <= 23) {
                    System.out.println("Akrep");
                } else {
                    System.out.println("Yay");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
        if (ay == 11) {
            if ((gun >= 1) && (gun <= 30)) {
                if (gun <= 22) {
                    System.out.println("Yay");
                } else {
                    System.out.println("Oğlak");
                }
            } else {
                System.out.println("Geçersiz gün girişi!");
            }
        }
    }
}
