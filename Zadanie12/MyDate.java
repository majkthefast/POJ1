package zadanie;

public class MyDate {
    private int month;
    private int day;
    private int year;

    MyDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        try {
            this.year = year;
            if (year < 1990 || year > 2050) {
                throw new IllegalArgumentException("Zakres to 1990-2050");
            }
        } catch (IllegalArgumentException błąd) {
            System.out.println(błąd.getMessage());
            System.exit(1);
        }
    }

    public void setMonth(int month) {
        try {
            this.month = month;
            if (month < 0 || month > 12) {
                throw new IllegalArgumentException("Jest tylko 12 miesięcy");
            }
        } catch (IllegalArgumentException błąd) {
            System.out.println(błąd.getMessage());
            System.exit(1);
        }
    }

    public void setDay(int day) {
        try {
            this.day = day;
            if (day < 0 || day > 31) {
                throw new IllegalArgumentException("Max 31,chociaż w niektórych miesiącach powinno być mniej");
            }
        } catch (IllegalArgumentException błąd) {
            System.out.println(błąd.getMessage());
            System.exit(1);
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void showDate() {
        System.out.print(day + "/" + month + "/" + year +"\n");
        }


}
