package Giris.Giris;

public class Diziler {
    public static void main(String[] args) {

        int number=1;
        int[][] liste = new int[3][4];

        for (int row= 0; row < liste.length; row++) {
            for (int column = 0; column < liste[row].length;column++){
                liste[row][column]=number++;
                System.out.print(liste[row][column]+" ");
            }
            System.out.println();
        }
        //Arrays.toString()
        //Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
        //Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        //Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
        //Arrays.binarySearch()
        //Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
        //Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        //Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.
        //Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
    }
}
