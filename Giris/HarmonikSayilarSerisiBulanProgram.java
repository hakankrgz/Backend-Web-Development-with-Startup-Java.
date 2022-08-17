package Giris.Giris;

import java.util.Scanner;

public class HarmonikSayilarSerisiBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double n;
        double result=0;
        System.out.print("N sayısını girin: ");
        n = inp.nextInt();
        for (double i=1;i<=n;i++){
            result+=1/i;
        }
        System.out.println(result);
    }
}