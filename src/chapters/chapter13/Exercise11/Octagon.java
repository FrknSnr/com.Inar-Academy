package chapters.chapter13.Exercise11;

import chapters.chapter13.Exercise01.GeometricObject;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2))) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 8 * side ;
    }

    @Override
    public int compareTo(Object o) {
        return this.getArea() > ((Octagon)o).getArea() ? 1 :this.getArea() > ((Octagon)o).getArea() ? -1 : 0;
    }
}
