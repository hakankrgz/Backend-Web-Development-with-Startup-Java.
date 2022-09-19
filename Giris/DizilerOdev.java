package Giris.Giris;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerOdev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = arr[0];
        int max = arr[0];

        System.out.print("Sayı girin: ");
        int number = inp.nextInt();

        Arrays.sort(arr);
        for (int i : arr) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("MAX: " + max + "\nMİN: " + min);

    }
}
