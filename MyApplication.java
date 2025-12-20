import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\sulta\\IdeaProjects\\Assignment1\\src\\source");

        Scanner sc = new Scanner(file);
        sc.useLocale(Locale.US);
        Shape shape = new Shape(new ArrayList<>());

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.perimeter());
        System.out.println(shape.Avgside());
        System.out.println(shape.Longestside());
    }
}
