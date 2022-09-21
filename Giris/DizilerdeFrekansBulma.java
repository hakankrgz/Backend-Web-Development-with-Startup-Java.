package Giris.Giris;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeFrekansBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] list={12,23,98,43,12,12,43,23,67,11,11,56,11,11,11,34};
        int[] count = new int[list.length];
        System.out.println("Dizi: "+ Arrays.toString(list));

        for (int i = 0; i <list.length; i++) {
            count[i]=1;
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((i != j)&&(list[i]==list[j]))  {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((j!=i)&&(list[i]==list[j]) ) {
                    count[j]=count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayılar");
        for (int i = 0; i< list.length ; i++) {
            if (i !=0) {
                System.out.println(list[i]+" sayısı "+count[i]+" kere tekrar edildi");
            }
        }
    }
    }
