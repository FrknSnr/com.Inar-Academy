package chapters.chapter13.Exercise09;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Circle circle1 = new Circle(5);
        int i = circle.compareTo(circle1);
        System.out.println(i);
        System.out.println(new Integer(circle1.compareTo(circle)));
    }
}
