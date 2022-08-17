package Giris.Giris;

import java.util.Scanner;

public class KucuktenBuyugeSayiSiralama {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        int A, B, C;

        System.out.println("A sayısını girin: ");
        A = inp.nextInt();

        System.out.println("B sayısını girin: ");
        B = inp.nextInt();

        System.out.println("C sayısını girin: ");
        C = inp.nextInt();

        if ((A < B) && (A < C)) {
            if (B < C) {
                System.out.println("A<B<C");
            } else {
                System.out.println("A<C<B");
            }
        } else if ((B < A) && (B < C)) {
            if (A < C) {
                System.out.println("B<A<C");
            } else {
                System.out.println("B<C<A");
            }
        } else {
            if (A < B) {
                System.out.println("C<A<B");
            } else {
                System.out.println("C<B<A");
            }
        }
    }
}
