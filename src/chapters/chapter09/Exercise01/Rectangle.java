package chapters.chapter09.Exercise01;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (2 * width + 2 * height);
    }
    /* Rectangle
      +width : double
      +height : double
      ---------------------
      +Rectangle()
      +Rectangle(width : double, height : double
      +getArea() : double
      +getPerimeter() : double
     */

    public void setHeight(double height) {
        this.height = height;

    }

    public void setWidth(double width) {
        this.width = width;
    }
}
