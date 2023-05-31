package taskShape;

import java.util.Objects;

public class Triangle implements Shape{
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }

    @Override
    public double areaFigure() {
        return side * height / 2;
    }
}
