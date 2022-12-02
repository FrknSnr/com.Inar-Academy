package chapters.chapter13.Exercise06;

import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable {

    private double radius;

    public ComparableCircle() {
        this(1);
    }

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public int compareTo(ComparableCircle o) {
        return this.getArea() > o.getArea() ? 1 : this.getArea() < o.getArea() ? -1 : 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

