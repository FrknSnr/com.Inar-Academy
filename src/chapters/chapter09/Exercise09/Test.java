package chapters.chapter09.Exercise09;

public class Test {
    public static void main(String[] args) {

        RegularPolygon r1 = new RegularPolygon() ;
        RegularPolygon r2 = new RegularPolygon(6,4) ;
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8) ;

        System.out.println("The area of the first regular polygon : " + r1.getArea() + " and the perimeter " + r1.getPerimeter());
        System.out.println("The area of the second regular polygon : " + r2.getArea() + " and the perimeter " + r2.getPerimeter());
        System.out.println("The area of the third regular polygon : " + r3.getArea() + " and the perimeter " + r3.getPerimeter());
    }

}
