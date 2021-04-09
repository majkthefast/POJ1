package zadanie;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Cyprian", "Zieliński", 1, 100, 6);
        Student s2 = new Student(2, 80, 4);
        Student s3 = new Student("Makłowicz", 3, 18);
        Student s4 = new Student(4, 58);

        Student s5 = new Student();

        System.out.println("Student 1");
        System.out.println("Imie : " +  s1.getImie() + " Nazwisko : " + s1.getNazwisko() + " ID : " + s1.getNrIndeksu()
                + " Obecność : " + s1.getObecność() + " Ocena : " + s1.getOcena());
        System.out.println("Student 2");
        System.out.println("Imie : " +  s2.getImie() + " Nazwisko : " + s2.getNazwisko() + " ID : " + s2.getNrIndeksu()
                + " Obecność : " + s2.getObecność() + " Ocena : " + s2.getOcena());
        System.out.println("Student 3");
        System.out.println("Imie : " +  s3.getImie() + " Nazwisko : " + s3.getNazwisko() + " ID : " + s3.getNrIndeksu()
                + " Obecność : " + s3.getObecność() + " Ocena : " + s3.getOcena());
        System.out.println("Student 4");
        System.out.println("Imie : " +  s4.getImie() + " Nazwisko : " + s4.getNazwisko() + " ID : " + s4.getNrIndeksu()
                + " Obecność : " + s4.getObecność() + " Ocena : " + s4.getOcena());
        System.out.println("Student pusty - 5");
        System.out.println("Imie : " +  s5.getImie() + " Nazwisko : " + s5.getNazwisko() + " ID : " + s5.getNrIndeksu()
                + " Obecność : " + s5.getObecność() + " Ocena : " + s5.getOcena());
        s5.setImie("Bez");
        s5.setNazwisko("imienny");
        s5.setNrIndeksu(404);
        s5.setObecność(100);
        s5.setOcena(6);
        System.out.println("Student 5");
        System.out.println("Imie : " +  s5.getImie() + s5.getNazwisko() + " ID : " + s5.getNrIndeksu()
                + " Obecność : " + s5.getObecność() + " Ocena : " + s5.getOcena());
    }
}
