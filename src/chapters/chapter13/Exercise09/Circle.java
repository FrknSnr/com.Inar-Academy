package chapters.chapter13.Exercise09;

public class Circle extends GeometricObject implements Comparable {
    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public boolean equals(Object obj) {
        return this.radius == ((Circle) obj).radius;
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
    public int compareTo(Circle o) {
        return this.getArea() > o.getArea() ? 1 : this.getArea() < o.getArea() ? -1 : 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
