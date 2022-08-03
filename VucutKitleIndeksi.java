package Giris;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);

        double kilo, boy, indeks;

        System.out.print("Boyunuz: ");
        boy= girdi.nextDouble();

        System.out.print("Kilonuz: ");
        kilo=girdi.nextDouble();

        indeks= kilo / (boy * boy);
        String cikti =(indeks>20) ? "güzel":"kötü";
        System.out.println(cikti);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);

    }
}
