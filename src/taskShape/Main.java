package taskShape;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double rad = 5;
        Circle circle = new Circle(rad);
        double areaCircle = circle.areaFigure();
        System.out.println("Площа кола з радіусом " + rad + " дорівнює: " +
                new DecimalFormat("#.00").format(areaCircle));

        double side = 8;
        double height =6;
        Triangle triangle = new Triangle(side,height);
        double areaTriangle = triangle.areaFigure();
        System.out.println("Площа трикутника зі стороною " + side +
                " і висотою " + height + " дорівнює: " + new DecimalFormat("#.00").format(areaTriangle));

        side = 8;
        Square square = new Square(side);
        double areaSquare = square.areaFigure();
        System.out.println("Площа квадрата зі стороною " + side +
                " дорівнює: " + new DecimalFormat("#.00").format(areaSquare));

      ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(circle);
        listShape.add(triangle);
        listShape.add(square);
        double areaAllShape = calcAreaAllShape(listShape);
        System.out.println("Загальна площа фігур дорівнює: " + new DecimalFormat("#.00").format(areaAllShape));

    }
    public static double calcAreaAllShape(ArrayList<Shape> arrayShape){
        double areaAll = 0;
        for (Shape shape : arrayShape) {
            areaAll += shape.areaFigure();
        }
        return areaAll;
    }
}
