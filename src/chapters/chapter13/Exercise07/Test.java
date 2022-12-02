package chapters.chapter13.Exercise07;

import chapters.chapter13.Exercise01.GeometricObject;
import chapters.chapter13.Exercise05.ComparableCircle;

public class Test {
    public static void main(String[] args) {

        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Square(3);
        arr[1] = new Square(5,"fenaaa",true);
        System.out.println();
        if (arr[0] instanceof Colorable){
            ((Colorable) arr[0]).howToColor() ;
        }
        System.out.println(arr[0].toString());

    }
}
