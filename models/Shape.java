package models;

import java.util.List;

public class Shape {
    List<Point> points;
    public Shape(List<Point> pts){
        points=pts;
    }
    public double getPerimeter(){
        double perimeter=0;
        for(int i=0; i<points.size(); i++){
            Point p1=points.get(i);
            Point p2=points.get((i+1) % points.size());
            perimeter+= p1.distance(p2);
        }
        return perimeter;
    }
    public double getLongestside(){
        double longa=0.0;
        for(int i= 0 ;i<points.size();i++){
            Point p1=points.get(i);
            Point p2=points.get((i+1) % points.size());
            double distance=p1.distance(p2);
            if (distance>longa){
                longa=distance;
            }
        }
        return longa;
    }
    public double getAverageLength(){
        int SidesNum = points.size();
        double P = getPerimeter();
        double Avgside = P / SidesNum;
        return Avgside;
    }

    public void addPoint(Point point) {
        points.add(point);
    }
}
