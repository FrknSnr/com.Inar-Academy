package chapters.chapter13.Exercise05;

public class Test {
    public static void main(String[] args) {

        ComparableRectangle rectangle1 = new ComparableRectangle(2,2);
        ComparableRectangle rectangle2 = new ComparableRectangle(3,3);

        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(3);

        System.out.println("The max rectangle : " + (ComparableGeometricObject.max(rectangle1,rectangle2) == rectangle1 ? "Rectangle1" : "Rectangle2"));
        System.out.println("The max circle : "+ (ComparableGeometricObject.max(circle1,circle2) == circle1 ? "Circle1" : "Circle2"));

    }
}
