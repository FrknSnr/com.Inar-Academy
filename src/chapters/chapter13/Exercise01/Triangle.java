package chapters.chapter13.Exercise01;


import chapters.chapter12.Exercises.Exercise05.IllegalTriangleException;

public class Triangle extends GeometricObject {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("Wrong side lengths.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) throws IllegalTriangleException {
        super(color, filled);
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("Wrong side lengths.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "The area of the triangle is : " + getArea() + "\nThe perimeter is : " + getPerimeter() +
                "\nThe color is : " + getColor() + "\nIs it filled ? : " + (isFilled() ? "Yes, it is filled" :"No it is not filled."  ) ;
    }
}
