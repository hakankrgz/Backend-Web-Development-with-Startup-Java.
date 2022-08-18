package Giris.OBS;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "9054531");
        Teacher t2 =new Teacher("Graham Bell", "FZK","90545121");
        Teacher t3 =new Teacher("Külyutmaz", "BIO","90545132121");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik= new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo= new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("İnek Şaban", "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,54,50);
        s1.isPass();

        Student s2=new Student("Güdük Necmi", "1234", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(53,54,50);
        s2.isPass();
    }
}
