package chapters.chapter13.Exercise12;

public class SumOfGeometricObjects {

    public static void main(String[] args) {

        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Circle(3.4);
        geometricObjects[2] = new Rectangle(5.5, 6);
        geometricObjects[3] = new Rectangle(3, 11);

        double sumOfAreas = sumArea(geometricObjects);
        System.out.println((int)(sumOfAreas * 100) / 100.0 );
    }

    public static double sumArea(GeometricObject[] geometricObjects) {
        double totalArea = 0;
        for (int i = 0; i < geometricObjects.length; i++) {
            totalArea += geometricObjects[i].getArea();
        }
        return totalArea;

    }
}
