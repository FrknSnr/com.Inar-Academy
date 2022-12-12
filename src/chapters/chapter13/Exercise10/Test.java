package chapters.chapter13.Exercise10;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,4);
        Rectangle rectangle1 = new Rectangle(3,5);
        System.out.println("Is rectangle equal with rectangle1 ? - " + rectangle.equals(rectangle1));
        System.out.println(rectangle.compareTo(rectangle1));
    }

}
