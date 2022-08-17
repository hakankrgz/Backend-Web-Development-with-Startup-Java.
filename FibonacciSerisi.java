package Giris;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Eleman sayısı girin: ");
        int n = inp.nextInt();
        int n1 = 0, n2 = 1, n3;

        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;
            System.out.println(n3 + ",");
            n1=n2;
            n2=n3;

        }
    }
}
