package Giris;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.print("KM cinsinden mesafe girin: ");
        String mesafe = inp.nextLine();
        boolean isNumber = mesafe.matches("\\d+");
        boolean isDoubleFormat = mesafe.matches("\\d+[.]\\d+");
        if (isNumber||isDoubleFormat){
            System.out.println(mesafe);
        }else {
            System.out.println("Yanlış değer");
        }

        System.out.println("Yolculuk tipi seçin.\n1=>Tek yön.\n2=>Çift yön.");
        int tip = inp.nextInt();
        System.out.print("Yaşınızı girin: ");
        int yas = inp.nextInt();

        //double mesafetutari = mesafe * 0.10, yasindirimli, total;
        //System.out.println(mesafetutari);

        /*if ((yas > 12) && (yas <= 24)){
        yasindirimli = (mesafetutari * 10) / 100;
        System.out.println("İnd. Genç: " + yasindirimli);
        if (tip == 2) {
            total = (mesafe - ((mesafe * 20) / 100)) + yasindirimli;
            System.out.println("Genç ve Çift Yön İndirimli Fiyat: " + total);
        }
        }*/
    }
}