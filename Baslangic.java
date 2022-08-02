package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");

        int numberOne = 1;
        int numberTwo, numberThree, numberFour;
        numberTwo = 2;
        numberThree = 3;
        numberFour = 4;
        int toplam = numberFour+numberOne+numberThree+numberTwo;
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

        int a=5,b=2;
        System.out.println(a+b); // +,-,*,/,%,

        int ab = 7;
        int ba = ab;
        System.out.println(ba);

        int q = 2, w= 3;
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
        int s = m%n;
        System.out.println(s);

        Scanner girdi = new Scanner(System.in);
        System.out.print("Adınız Soyadınız=");
        String metinGirdisi = girdi.nextLine();
        System.out.println(metinGirdisi);

        Scanner doubleGirdisi = new Scanner(System.in);
        System.out.print("\",\" Kullanarak Ondalık Sayı Giriniz=");
        double kulanicigirdisi = doubleGirdisi.nextDouble();
        System.out.println(doubleGirdisi);
    }
}