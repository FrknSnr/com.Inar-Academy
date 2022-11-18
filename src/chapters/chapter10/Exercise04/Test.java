package chapters.chapter10.Exercise04;

public class Test {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 35.5);

        System.out.println(p1.distance(p2));

        //NOT : Bu kısım soruda istenmiyor!

        System.out.println(p1.distance(1,0));
        System.out.println(p2.distance(p1));
        System.out.println(p2.distance(1,0));

    }
}
