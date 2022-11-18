package chapters.chapter10.Exercise11;

public class Test {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("The area of the circle is : " + c1.getArea());
        System.out.println("The perimeter of the circle is : " + c1.getPerimeter());
        System.out.println("Does the circle contain (3,3) ? : " + c1.contains(3,3));
        System.out.println("Does the circle contain new Circle2D(2,4,10.5) ? : " + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Does the circle overlap with the new Circle2D(3,5,2.3) ? : " + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
