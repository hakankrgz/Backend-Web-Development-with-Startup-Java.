package Giris.OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note = 0;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printCourse() {
        System.out.println("Ders adı: " + this.name);
        System.out.println("Ders Kodu: " + this.code);
        System.out.println("Ders Öneki: " + this.prefix);
        System.out.println("============================");
    }
}
