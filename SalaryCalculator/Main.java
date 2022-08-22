package Giris.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        CalisanClass Hakan = new CalisanClass("Hakan Karagöz", 24550, 46, 10);
        Hakan.printinfo();
        CalisanClass Mustafa = new CalisanClass("Mustafa Karagöz", 15432, 42,13);
        Mustafa.printinfo();
        CalisanClass Yasemin= new CalisanClass("Yasemin Karagöz", 250454, 40,1);
        Yasemin.printinfo();
    }

}
