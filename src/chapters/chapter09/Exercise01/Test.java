package chapters.chapter09.Exercise01;

public class Test {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setWidth(4);
        r1.setHeight(40);
        Rectangle r2 = new Rectangle();
        r2.setWidth(3.5);
        r2.setHeight(35.9);

        System.out.println("First rectangle's width - height - area and perimeter "
                + r1.width + " " + r1.height + " " + r1.getArea() + " " + r1.getPerimeter());
        System.out.println("Second rectangle's width - height - area and perimeter "
                + r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
    }
}
