package zadanie;

public class Numbers {
    private int first;
    private int second;
    private int third;

    Numbers(int first, int second, int three) {
        this.first = first;
        this.second = second;
        this.third = three;
    }

    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    public int getThird() {
        return third;
    }

    public long suma() {
        return (long) first + second + third;
    }

    public double średnia() {
        return (double) suma() / 3;
    }
    public int min() {
        int x = first;
        int y = second;
        if (third > y) {
            if (second < x) {
                x = second;
            }
        }
        if(third < x){
            x=third;
        }
        return x;
    }
    public int max() {
        int x = first;
        int y = second;
        if (y>third) {
            if (second > x) {
                x = second;
            }
        }
        if (third > x) {
            x = third;
        }
        return x;
    }

    public double geometric() {
        long Iloczyn = (long) first * second * third;
        double Stopień = (double) 1/3; //pierwiastek
        return Math.pow(Iloczyn, Stopień); //zwraca potęgę w sensie zwraca iloczyn do potegi 1/3
    }
}
