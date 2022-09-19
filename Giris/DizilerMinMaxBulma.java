package Giris.Giris;

import java.util.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class DizilerMinMaxBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] dizi = {21, -12, 213, -3, 311, 3, 2678, -123};
        System.out.print("Sayı Girin: ");
        int n=inp.nextInt();
        Arrays.sort(dizi);
        System.out.print(Arrays.toString(dizi));
        for (int i : dizi) {

        }
    }
}
