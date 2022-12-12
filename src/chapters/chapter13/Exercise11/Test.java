package chapters.chapter13.Exercise11;

public class Test {
    public static void main(String[] args) {

        Octagon octagon = new Octagon(5);
        System.out.println("The area of the octagon is : " +(int)(octagon.getArea()*100) / 100.0 + "\nThe perimeter of it : " + octagon.getPerimeter());

        Octagon octagon1 = new Octagon(4);
        System.out.println(octagon.compareTo(octagon1));
    }

}
