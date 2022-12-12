package chapters.chapter13.Exercise10;

import chapters.chapter11.Exercise01.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable {
    private double width;
    private double height;


    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public int compareTo(Rectangle o) {
        return this.getArea() > o.getArea() ? 1 : this.getArea() < o.getArea() ? -1 : 0;
    }

    @Override
    public int compareTo(Object o) {
        return this.getArea() > ((Rectangle)o).getArea() ? 1 :this.getArea() < ((Rectangle)o).getArea() ? -1 : 0 ;

    }

    @Override
    public boolean equals(Object obj) {
        return this.getArea() == ((Rectangle)obj).getArea();
    }
}
