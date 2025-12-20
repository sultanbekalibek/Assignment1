
package models;

public class Point {
    private double x;
    private double y;
    public Point(double xCrd,double yCrd){
        x=xCrd;
        y=yCrd;
    }
    public double distance(Point first){
        double X= first.x - x;
        double Y= first.y - y;
        return Math.sqrt(X*X+Y*Y);
    }
}
