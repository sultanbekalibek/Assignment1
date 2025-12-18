package Models;

import java.util.List;

public class Shape {
    List<Point> points;
    public Shape(List<Point> pts){
        points=pts;
    }
    public double perimeter(){
        double perimeter=0;
        for(int i=0;i<points.size();i++){
            Point num1=points.get(i);
            Point num2=points.get((i+1) % points.size());
            perimeter+= num1.distance(num2);
        }
        return perimeter;
    }
    public double Longestside(){
        double longa=0;
        for(int i= 0 ;i<points.size();i++){
            Point num1=points.get(i);
            Point num2=points.get((i+1) % points.size());
            double distance=num1.distance(num2);
            if (distance>longa){
                longa=distance;
            }
        }
        return longa;
    }
    public double Avgside(){
        return perimeter()/points.size();
    }

    public void addPoint(Point point) {
        points.add(point);
    }
}