package Giris;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a Number : ");
        number = scanner.nextInt();

        int total = 0, donguSayisi = 0;
        double ortalama;

        for(int i =0; i<=number; i++){
            if(i % 3 == 0 && i % 4 == 0 && i>0){
                total += i;
                donguSayisi++;

            }
        }
        ortalama = total / donguSayisi;
        System.out.println("0 dan Girilen Sayıya kadar 3 ve 4 e bölünebilen sayıların ortalaması : " +ortalama);
    }
}
