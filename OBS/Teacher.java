package Giris.OBS;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Branş: " + this.branch);
        System.out.println("Telefon: " + this.mpno);
    }
}
