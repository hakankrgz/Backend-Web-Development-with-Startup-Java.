package Giris;
import java.util.Scanner;
public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);

        int kenar1, kenar2;
        double hipotenus;

        System.out.print("1. Kenar Uzunluğunu Girin: ");
        kenar1 = girdi.nextInt();
        System.out.print("2. Kenar Uzunluğunu Girin: ");
        kenar2 = girdi.nextInt();

        hipotenus= Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.print("Hipotenüs: ");
        System.out.println(hipotenus);
    }
}
