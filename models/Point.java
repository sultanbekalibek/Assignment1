package models;

public class Point {
    private double x;
    private double y;
    public Point(double xCrd,double yCrd){
        x=xCrd;
        y=yCrd;
    }
    public double distance(Point point1){
        double X= point1.x - x;
        double Y= point1.y - y;
        return Math.sqrt(X*X+Y*Y);
    }
}
