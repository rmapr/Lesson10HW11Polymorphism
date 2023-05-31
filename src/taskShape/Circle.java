package taskShape;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return (Math.PI * Math.pow(radius,2) / 2);
    }
}
