package Giris;

import java.util.Scanner;

public class GirilenSayiyaKadar2ninKuvvetleriYazdiranProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Max Limit: ");
        double number = inp.nextDouble();
        for (double i = 1; i <= number; i *= 2) {
            System.out.println("Kuvvet: " + i);
        }
    }
}