package Giris.Giris;

import java.util.Scanner;

public class AmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = inp.nextInt();
        int basNumber = 0;
        int endBas;
        int numPow;
        int result = 0;

        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;//her döngüde bir basamak azalıyor ve basamağa 1 ekliyor bu sayede basamak sayısı bulunuyor
        }

        tempNumber = number;
        while (tempNumber != 0) {
            endBas = tempNumber % 10;//her döngüde son basamağı alıyor yani 10a bölümden kalan son basamak olanı

            numPow = 1;//alttaki döngü bittiğinde tekrar resetlenmiş şekilde girmesi için 1 atıyoruz.
            for (int i = 1; i <= basNumber; i++) {//basamak sayısını üs alıp yukarıdan aldığımız son basamaktaki sayıyı alt alıyoruz
                numPow *= endBas;//alınan son basamak ve üs burada hesaplanıypr
            }
            result += numPow;//her basamağın üssü burada kaydediliyor ve toplanıyor
            tempNumber /= 10;//10a bölerek her son basamak siliniyor
        }

        if (result == number) {
            System.out.println(number + " sayısı amstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı amstrong sayı değildir.");
        }
    }
}
