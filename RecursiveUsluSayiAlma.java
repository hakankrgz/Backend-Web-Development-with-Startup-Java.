package Giris;

import java.util.Scanner;

public class RecursiveUsluSayiAlma {
    static int us() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban Girin: ");
        int t = inp.nextInt();
        System.out.println("Üs değer: ");
        int u = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= u; i++) {
            result *= t;
        }
        System.out.println("Cevap " + result);
        return 0;
    }

    public static void main(String[] args) {
        us();
    }
}
