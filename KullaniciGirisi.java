package Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String newPassword = "";

        System.out.println("Kullanıcı Adınız: ");
        String userName = inp.nextLine();
        System.out.println("Parola: ");
        String password = inp.nextLine();

        if (userName.equals("ghostman") && password.equals("1234")) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Parola Değiştirmek için 1'e Basın! ");
            int select = inp.nextInt();
            if (select == 1) {
                System.out.println("Yeni Parola:");
                newPassword = inp.nextLine();
            }
            if (select == 0) {
                System.out.println("Sayfayı Yenileyin!");
            }
            if (newPassword.equals("ghostman123") && userName.equals("ghostman")) {
                System.out.println("Giris Başarılı!");
            }
        }
    }
}

