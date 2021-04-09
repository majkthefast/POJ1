package zadanie;

public class Student {

    private String imie = "Unknown"; //Default
    private String nazwisko = "Unknown";
    private int ID;
    private int obecność;
    private int ocena;

    public Student() { //s5

    }

    public Student(String imie, String nazwisko, int ID, int obecność, int ocena) { //s1
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ID = ID;
        this.ocena = ocena;
        setObecność(obecność);
    }

    public Student(int ID, int obecnosc, int ocena) { //s2
        this.ID = ID;
        this.ocena = ocena;
        setObecność(obecnosc);
    }

    public Student(String nazwisko, int ID, int obecność) { //s3
        this.nazwisko = nazwisko;
        this.ID = ID;
        setObecność(obecność);
    }

    public Student(int ID, int obecnosc) { //s4
        this.ID = ID;
        setObecność(obecność);
    }

        //SETTERY

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.ID = nrIndeksu;
    }

    public void setObecność(int obecność) {
        this.obecność = obecność;
        //Jeżeli obecność jest mniejsza niż 50%, student powinien otrzymać automatycznie ocenę 2.
        if (obecność < 50) {
            setOcena(2);
        }
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

        //GETTERY

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndeksu() {
        return ID;
    }

    public int getObecność() {
        return obecność;
    }

    public int getOcena() {
        return ocena;
    }
}