package zadanie;

public class Segment {

    Point v1 = new Point();
    Point v2 = new Point();

    public Segment(Point v1, Point v2) {
        this.v1=v1;
        this.v2=v2;
    }

    public String toString() {
        return "Segment[v1=(" + v1.getX() + "," + v1.getY() + "),v2=(" + v2.getX() + "," + v2.getY() + ")]";
    }
    public double getLength(){
        return v1.distance(v2);
    }
}