package Giris.Giris;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        //C(n,r) =
        // n!
        // ---
        // (r! * (n-r)!)
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = inp.nextInt();
        System.out.print("Enter The Combination Type: ");
        int r = inp.nextInt();
        int fac_n = 1;
        int fac_r = 1;
        int a = n - r;
        int fac_a = 1;

        for (int i = 1; i <= n; i++) {
            fac_n *= i;
        }
        for (int i = 1; i <= r; i++) {
            fac_r *= i;
        }
        for (int i = 1; i <= a; i++) {
            fac_a *= i;
        }
        int answer = fac_n / (fac_r * (fac_a));
        System.out.println("Combination: " + answer);
    }
}
