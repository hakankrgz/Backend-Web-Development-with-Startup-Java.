package Giris;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        int i = 0;
        int j = 0;
        int k = 1;

        do {
            while (j<=(n-i)){
                System.out.print(" ");
            }
            j++;

            while (k<=(2*i+1)){
                System.out.println("*");
            }
            k++;

            i++;
        }while (i==n);
    }
}
