package chapters.chapter13.Exercise05;

public class ComparableRectangle extends ComparableGeometricObject {
    private double height;
    private double width;

    public ComparableRectangle(){
        this(0,0);
    }
    public ComparableRectangle(double height, double width){
        this.height = height ;
        this.width = width ;
    }
    @Override
    public double getArea() {
        return width * height ;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( width + height );
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
