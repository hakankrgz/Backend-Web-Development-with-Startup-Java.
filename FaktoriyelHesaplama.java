package Giris;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = inp.nextInt();
        int total=1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("Answer: " + total);
    }
}
