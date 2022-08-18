package Giris.SalaryCalculator;

import java.util.InputMismatchException;

public class CalisanClass {
    /*
    Sınıfın Nitelikleri

    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı

    Sınıfın Metotları

    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat
    başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki
    yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
     */

    String name;
    double salary;
    int workHours;
    int hireYear;

    CalisanClass(String name, double salary, int workHours, int hireYear) {
        try {
            this.name = name;
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entry!");
        }
        try {
            this.salary = salary;
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entry!");
        }
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double taxCal() {
        if (this.salary > 1000.0) {
            this.salary -= (this.salary * 0.03);
            return this.salary;
        } else {
            this.salary += 0;
            return this.salary;
        }
    }

    double bonus() {
        if (workHours > 40) {
            this.salary += (workHours - 40) * 30;
            return this.salary;
        } else {
            return this.salary;
        }
    }

    double raiseSalary() {
        if (hireYear < 10) {
            this.salary += (this.salary * 0.05);
            return this.salary;
        } else if (hireYear < 20) {
            this.salary += (this.salary * 0.10);
            return this.salary;
        } else {
            this.salary += (this.salary * 0.15);
            return this.salary;
        }
    }

    void printinfo() {
        System.out.println("Employee Name         :" + this.name);
        System.out.println("Employee Work Hours   :" + this.workHours);
        System.out.println("Employee Hire Years   :" + this.hireYear);
        System.out.println("Employee Raw Salary   :" + this.salary);
        System.out.println("Employee Tax Salary   :" + taxCal());
        System.out.println("Employee Bonus Salary :" + bonus());
        System.out.println("Employee End Raise Salary : " + raiseSalary());
        System.out.println("================================================");
    }
}