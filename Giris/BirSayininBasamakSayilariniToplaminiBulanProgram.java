package Giris.Giris;

import java.util.Scanner;

public class BirSayininBasamakSayilariniToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = inp.nextInt();
        int endNum;
        int resualt = 0;
        int tempnumber = number;
        while (tempnumber != 0) {
            endNum = tempnumber % 10;
            tempnumber /= 10;
            resualt += endNum;
        }
        System.out.println("Basamakları toplamı: " + resualt);
    }
}