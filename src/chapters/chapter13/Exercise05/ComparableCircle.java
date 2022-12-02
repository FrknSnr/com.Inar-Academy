package chapters.chapter13.Exercise05;

public class ComparableCircle extends ComparableGeometricObject {

    private double radius;

    public ComparableCircle() {
        this(0);
    }

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
