package zadanie;

public class Triangle {

    Point v1 = new Point();
    Point v2 = new Point();
    Point v3 = new Point();

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Segment[v1=(" + v1.getX() + "," + v1.getY() +
                "),v2=(" + v2.getX() + "," + v2.getY() +
                "),v3=(" + v3.getX() + "," + v3.getY() + ")]";
    }
    public double getDistances() {
        Segment segment1 = new Segment(v1,v2);
        Segment segment2 = new Segment(v2,v3);
        Segment segment3 = new Segment(v3,v1);

        return segment1.getLength() + segment2.getLength() + segment3.getLength();
    }
    public double getDistancesR() {
        Segment segment0 = new Segment(v1,v1);


        return segment0.getLength() + segment0.getLength() + segment0.getLength();
    }

    public void getType() {
        Segment segment1 = new Segment(v1,v2);
        Segment segment2 = new Segment(v1,v2);
        Segment segment3 = new Segment(v3,v1);

        if ((segment1.getLength() != segment2.getLength()) && (segment1.getLength() != segment3.getLength()) && (segment2.getLength() != segment3.getLength())) {
            System.out.println("Trójkąt jest różnoboczny");
        } else if ((segment1.getLength() == segment2.getLength()) && (segment2.getLength() == segment3.getLength()) && segment3.getLength() == segment1.getLength()) {
            System.out.println("Trójkąt jest równoboczny");
        } else {
            System.out.println("Trójkąt jest równoramienny");
        }
    }
}