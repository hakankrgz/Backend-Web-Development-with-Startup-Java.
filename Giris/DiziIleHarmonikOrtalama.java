package Giris.Giris;

public class DiziIleHarmonikOrtalama {
    public static void main(String[] args) {
        double[] dizi = {2, 54, 31, 36};
        double sum = 0;

        for (double i : dizi) {
            sum += 1 / i;
        }
        System.out.println(sum);
    }
}