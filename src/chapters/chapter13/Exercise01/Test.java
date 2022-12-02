package chapters.chapter13.Exercise01;

import chapters.chapter12.Exercises.Exercise05.IllegalTriangleException;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color :");
        String color = input.next();
        System.out.println("Enter true if the triangle is filled. Otherwise enter false :");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = null;

        try {
            triangle = new Triangle(color, isFilled, side1, side2, side3);

        } catch (IllegalTriangleException e) {
            System.out.println("You entered invalid sides.");
        }
        System.out.println(triangle.toString());
    }
}
