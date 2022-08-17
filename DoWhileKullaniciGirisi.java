package Giris;
import java.util.*;
public class DoWhileKullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        boolean askPass=true;
        int pass=0;
        do {
            System.out.print("Şifre Girin: ");
            try {
                pass= inp.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Geçersiz Değer Girişi, Sadece Sayı Girin!");
                System.exit(0);
            }
            if (pass == 123){
                System.out.println("Doğru");
                askPass=false;
            }else {
                System.out.println("Yanlış");
            }
        }while (askPass);
        System.out.println("İşleme Devam Edebilirsiniz");
    }
}
