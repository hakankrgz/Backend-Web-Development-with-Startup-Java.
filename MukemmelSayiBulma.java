package Giris;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i;
        int x=0;
        System.out.print("Sayı Girin: ");
        int n = inp.nextInt();

        for (i=1;i<=n; i++){
            if (n%i==0){
                x+=i;
            }
        }
        if (x==2*n){
            System.out.println(n+" sayısı mükemmel sayıdır.");
        }else {
            System.out.println(n+" sayısı mükemmel sayı değildir.");
        }
    }
}
