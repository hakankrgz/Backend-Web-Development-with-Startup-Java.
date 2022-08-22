package Giris.Test;

public class test {

     static double printLists(String[] lists) {
        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }
        return 0;
    }

    public static void main(String[] args) {

        String[] liste = {"ahd", "sad", "cassa"};
        liste[0] = "aaavv";
        printLists(liste);

        String [] liste2 = new String[4];
        liste2[0]="12";
        liste2[3]="14.22";
        printLists(liste2);

    }
}