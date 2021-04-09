package zadanie;

public class Main {

    public static void main(String[] args) {
        Point v1 = new Point(20, 40);
        Point v2 = new Point(30,60);
        Point v3 = new Point(40,80);
        Segment testSegment = new Segment(v1, v2);
        Triangle różny = new Triangle(v1, v2, v3);
        Triangle równy = new Triangle(v1, v1, v1);
        Triangle równo = new Triangle(v1, v1, v2);

        System.out.println(testSegment.toString());
        System.out.println("Obwód to " + testSegment.getLength() + "\n");

        różny.getType();
        System.out.println(różny.toString());
        System.out.println("Obwód to " + różny.getDistances() + "\n");

        równy.getType();
        System.out.println(równy.toString());
        System.out.println("Obwód to " + równy.getDistancesR() + "\n");

        równo.getType();
        System.out.println(równo.toString());
        System.out.println("Obwód to " + równo.getDistances() + "\n");
    }
}
