package chapters.chapter10.Exercise13;

public class Test {
    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.contains(3,3));
        System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
    }
}
