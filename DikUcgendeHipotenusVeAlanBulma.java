package Giris;

import java.util.Scanner;

public class DikUcgendeHipotenusVeAlanBulma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double hipotenus, kenar1, kenar2, cevre, yc, alan;

        System.out.print("1. Dik Kenar Uzunluğunu Girin: ");
        kenar1 = girdi.nextDouble();
        System.out.print("2. Dik Kenar Uzunluğunu Girin: ");
        kenar2 = girdi.nextDouble();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        cevre = kenar1 + kenar2 + hipotenus;

        yc = cevre / 2;
        alan = Math.sqrt(yc * (yc - kenar1) * (yc - kenar2) * (yc - hipotenus));
        System.out.println("Hipotenüs: " + hipotenus);
        System.out.println("Alan: " + alan);
    }
}
