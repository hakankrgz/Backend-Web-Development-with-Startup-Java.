package Giris.BoksMatch;

public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Aziz",10,100,95,30);
        Fighter f2 = new Fighter("B",15,85,85,25);
        Match match= new Match(f1,f2,100,85);
        match.run();


    }
}
