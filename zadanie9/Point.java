package zadanie;

public class Point {
    private double x;
    private double y;


    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }

    public Point getCoordinates() {
        Point point = new Point();
        point.setCoordinates(x,y);
        return point;
    }
    public void setCoordinates(Point point){
        this.x=point.x;
        this.y=point.y;
    }
    public void setCoordinates(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=320;
        this.y=200;
    }
    public Point(double i, double j){
        this.x=i;
        this.y=j;
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y),2));
    }
}


