package chapters.chapter13.Exercise07;

import chapters.chapter13.Exercise01.GeometricObject;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this(side,"white",false) ;
    }

    public Square(double side, String color, boolean isFilled) {
        super(color, isFilled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
    public String toString(){
        return getArea() + " " ;
    }
}

