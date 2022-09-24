package Giris.Giris;

import java.util.Scanner;

public class MayinTarlasiOyunu {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Mayın tarlası oynuna hoş geldin !\n"+
            "koordinat seçerken ,bayrak dikmek istersen koordinattan sonra 'f' harfini gir ,örneğin : (3 1 f)\n"+
            "tarlanın boyutunu gir ,örneğin : (4 7)  : ");
    int x , y ;
    x = scanner.nextInt();
    y = scanner.nextInt();
    MineSweeper mineSweeper = new MineSweeper(x, y);
    //mineSweeper.printMineMap();
    mineSweeper.run();
    scanner.close();
}
}
