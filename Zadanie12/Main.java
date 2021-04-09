package zadanie;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(1999, 11, 28);
        date.showDate();

        MyDate dateerror = new MyDate(1989, 7, 11);
        dateerror.showDate();
        MyDate dateerror2 = new MyDate(1991, 13, 11);
        dateerror2.showDate();
        MyDate dateerror3 = new MyDate(1992, 11, 40);
        dateerror3.showDate();
    }
}
