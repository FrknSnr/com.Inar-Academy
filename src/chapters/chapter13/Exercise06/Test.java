package chapters.chapter13.Exercise06;

public class Test {
    public static void main(String[] args) {

        ComparableCircle circle1 = new ComparableCircle(4);
        ComparableCircle circle2 = new ComparableCircle(3);

        System.out.println(( circle1.compareTo(circle2) == 1 ? "The larger one is : Circle1" : circle1.compareTo(circle2) == -1 ? "The larger one is : Circle2": "They are same"));
    }
}
