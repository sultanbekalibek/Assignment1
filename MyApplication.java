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
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Выберите действие");
            System.out.println("Периметр фигуры:");
            System.out.println("Длина самой длинной стороны:");
            System.out.println("Средняя длина сторон");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Периметр=" + shape.getPerimeter());
                    break;
                case 2:
                    System.out.println("Длина самой длинной стороны=" + shape.getLongestside());
                    break;
                case 3:
                    System.out.println("Средняя длина сторон=" + shape.getAverageLength());
                    break;
                default:
                    System.out.println("Неправильный выбор,попробуйте снова");
            }

        }
    }
}


