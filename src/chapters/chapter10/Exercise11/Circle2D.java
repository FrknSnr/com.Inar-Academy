package chapters.chapter10.Exercise11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);

    }

    public Circle2D(double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public boolean contains(double x, double y) {
        return Math.sqrt((Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2))) < getRadius();
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt((Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY()- getY(), 2))) < getRadius();
    }
    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + (Math.pow(circle.getY() - y, 2)));
        return distance <= (this.radius + circle.radius) && distance >= Math.abs(this.radius - circle.radius);
    }
}
