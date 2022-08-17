package Giris.Giris;

import java.util.Scanner;

public class RecursiveUsluSayiAlma {
    static int power(int base  , int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base,powerRaised-1));

        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban: ");
        int base=inp.nextInt();
        System.out.print("Üs:");
        int powerRaised=inp.nextInt();

        int result = power(base, powerRaised);

        System.out.println(base + "^" + powerRaised + "=" + result);
    }
}
