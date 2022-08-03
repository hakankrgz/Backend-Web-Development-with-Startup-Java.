package Giris;
import java.util.Scanner;
public class DaireninAlaniniVeCevresiniBulma {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        double pi= 3.141592653589793,r,alan,cevre, a,pa;

        System.out.println("Yarı Çap Giriniz: ");
        r=girdi.nextDouble();

        System.out.println("Merkez Açı Ölçüsü Gİriniz: ");
        a=girdi.nextDouble();
        pa=(pi * (r*r) * a) / 360;

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Parça Alanı" + pa);
        System.out.println("Daire Alanı: " + alan);
        System.out.println("Daire Çevresi: " + cevre);
    }
}
