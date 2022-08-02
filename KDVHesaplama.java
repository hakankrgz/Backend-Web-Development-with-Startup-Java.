package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvtutari, kdvdahil, kdv = 0.18;

        System.out.print("Tutar Giriniz: ");
        tutar = input.nextDouble();

        kdvtutari = tutar * kdv;

        kdvdahil = kdvtutari + tutar;

        System.out.println("KDV'siz Tutar : "+ tutar);
        System.out.println("KDV ORANI: "+ kdv);
        System.out.println("KDV'li Tutar: "+kdvdahil);
        System.out.println("KDV Tutarı: "+ kdvtutari);
    }
}
