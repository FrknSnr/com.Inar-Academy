package chapters.chapter10.Exercise12;

import chapters.chapter10.Exercise04.MyPoint;

public class Triangle2D {

    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double s1() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public double s2() {
        return Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
    }

    public double s3() {
        return Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
    }

    public double getArea() {
        double s = (s1() + s2() + s3()) / 2;
        return Math.sqrt(s * (s - s1()) * (s - s2()) * (s - s3()));
    }

    public double getPerimeter() {
        return s1() + s2() + s3();
    }

    public boolean contains(double x, double y) {
        MyPoint p = new MyPoint(x, y);

        boolean b1, b2, b3;

        b1 = loc(p, p1, p2) < 0.0;
        b2 = loc(p, p2, p3) < 0.0;
        b3 = loc(p, p3, p1) < 0.0;

        return ((b1 == b2) && (b2 == b3));

    }

    private double loc(MyPoint p, MyPoint p1, MyPoint p2) {

        double x = p.getX();
        double y = p.getY();
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        return (x - x2) * (y1 - y2) - (x1 - x2) * (y - y2);
    }

    public boolean contains(Triangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (this.contains(points[i].getX(), points[i].getY())) {
                count++;
            }
        }

        return count == 3;

    }


    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public boolean overlaps(Triangle2D t) {
        MyPoint[] points = new MyPoint[3];
        points[0] = t.getP1();
        points[1] = t.getP2();
        points[2] = t.getP3();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (this.contains(points[i].getX(), points[i].getY()))
                count++;
        }

        return (count > 0 && count < 3);
    }


}
