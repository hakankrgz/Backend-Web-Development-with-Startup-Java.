package Giris.Giris;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

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
                String newPassword = inp.next();
                System.out.println("Parola Güncellendi! Yeni Parola: " + newPassword);
                System.out.println("Kullanıcı Adınız: ");
                userName = inp.next();
                System.out.println("Parola: ");
                newPassword = inp.next();
                if (newPassword.equals("ghostman123") && userName.equals("ghostman")) {
                    System.out.println("Giriş Başarılı!");
                } else {
                    System.out.println("Şifre sisteme kayıtlı değil ya da, hatalı giriş yaptınız!");
                }
            } else {
                System.out.println("1'i Seçmediniz. Sayfayı Yenileyin!");
            }
        }
    }
}

