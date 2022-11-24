package chapters.chapter12.Exercises.Exercise05;

public class Test {
    public static void main(String[] args) {
        try{
            Triangle triangle = new Triangle(2,2,6);
        }catch (IllegalTriangleException ex){
            System.out.println("ahhaaaa !!!");
        }try {
            Triangle triangle1 = new Triangle(2,3,4);
            System.out.println(triangle1.toString());
        }catch (IllegalTriangleException ex){
            System.out.println("SG");
        }
    }
}
