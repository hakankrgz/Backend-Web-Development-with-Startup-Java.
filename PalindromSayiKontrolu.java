package Giris;

import java.util.Scanner;
import java.util.SortedMap;

public class PalindromSayiKontrolu {
     static boolean isPalindrom (int number){

         int temp=number, lastNumber, reverseNumber=0;
         while (temp!=0){
             lastNumber=temp%10;
             reverseNumber=(reverseNumber*10)+lastNumber;
             temp/=10;
         }
         if (number==reverseNumber)
             return true;
         else
             return false;
     }
    public static void main(String[] args) {
        System.out.println(isPalindrom(344));
    }
}
