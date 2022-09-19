package Giris.Giris;

import java.util.Scanner;

public class  Baslangic {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");

        int numberOne = 1;
        int numberTwo, numberThree, numberFour;
        numberTwo = 2;
        numberThree = 3;
        numberFour = 4;
        int toplam = numberFour + numberOne + numberThree + numberTwo;
        System.out.println(toplam);

        byte vByte = 100;
        short vShort = 1000;
        int vInt = 10000;
        long vLong = 100000;
        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInt);
        System.out.println(vLong);

        float vFloat = 3.14f;
        System.out.println(vFloat);
        double vDouble = 3.14;
        System.out.println(vDouble);

        char vChar = 'a';
        char v2Char = 97;
        System.out.println(vChar);
        System.out.println(v2Char);

        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';
        System.out.println("" + c1 + c2 + c3 + c4);

        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru);
        System.out.println(yanlis);

        String vStrn = "Hello String!";
        System.out.println(vStrn);

        int a = 5, b = 2;
        System.out.println(a + b); // +,-,*,/,%,

        int ab = 7;
        int ba = ab;
        System.out.println(ba);

        int q = 2, w = 3;
        //w += q; w = w + q
        //w -= q; w = w - q
        //w *= q; w = w * q
        w /= q; //w = w / q
        // w %= q; w = w % q
        System.out.println(w);

        int sayi1 = 3, sayi2 = 7;
        boolean kosul1 = sayi1 == sayi2;
        boolean kasul2 = sayi1 >= sayi2;
        boolean sonuc = kasul2 || kosul1;
        String str = sayi1 == sayi2 ? "Doğru" : "Değil";
        System.out.println(str);

        int m = -12, n = -5;
        int s = m % n;
        System.out.println(s);
        Scanner girdi = new Scanner(System.in);
        System.out.print("Adınız Soyadınız=");
        String metinGirdisi = girdi.nextLine();
        System.out.println(metinGirdisi);

        Scanner doubleGirdisi = new Scanner(System.in);
        System.out.print("\",\" Kullanarak Ondalık Sayı Giriniz=");
        double kulanicigirdisi = doubleGirdisi.nextDouble();
        System.out.println(doubleGirdisi);

        int points = 75;
        switch (points) {
            case 75:
                ;
            case 7:
                System.out.println("Java");
                break;
            case 8:
                ;
            case 9:
                System.out.println("101");
                break;
            case 10:
                System.out.println("Patika");
                break;
            default:
                System.out.println("Dev");


                float saltRatio = 0.9f;
                if (saltRatio >= 0.8) {
                    System.out.println("yüksek derecede tuzlu");
                } else if (0.5 < saltRatio && saltRatio < 0.8) {
                    System.out.println("orta derecede tuzlu");
                } else {
                    System.out.println("düşük derecede tuzlu");
                }
        }

        //while döngüsü kaç defa döneceğini bilmediğimiz durumlarda kullanılır
        System.out.println("While Döngüsü");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            ++i;
        }

        //do-while, do'ya en az bir kere girer ve altindaki while karşılanmayana dek döner
        System.out.println("Do-While Döngüsü");
        int d = 1, j = 1;
        while (d < 3) {
            do {
                System.out.println(j + ",");
                j++;
            } while (j < 4);
            d++;
        }

        //for döngüsü kaç defa döneceğini bildiğimiz durumlarda kullanılır
        System.out.println("For Döngüsü");
        for (int v = 0; v <= 10; v += 2) {
            System.out.println(v);
        }

        System.out.println("For Döngüsü2");
        int sum = 0;
        for (int o = 0, y = 0; o < 5 || y < 5; ++o, y = o + 1) {
            System.out.println("y: " + y);
            System.out.println("o: " + o);
            sum += o;
        }
        System.out.println(sum);


    }
}