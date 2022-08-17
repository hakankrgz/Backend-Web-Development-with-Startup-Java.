package Giris.Giris;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the üssü alınacak number: ");
        int n = inp.nextInt();
        System.out.print("Enter the üs number: ");
        int k = inp.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}
