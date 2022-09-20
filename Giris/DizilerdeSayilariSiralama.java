package Giris.Giris;
import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeSayilariSiralama {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int[] dizi = new int[6];

        System.out.println("Dizi Boyutu: " + dizi.length);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". Elemanı girin: ");
            int eleman=inp.nextInt();
            dizi[i]=eleman;
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}
