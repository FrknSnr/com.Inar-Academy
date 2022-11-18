package chapters.chapter11.Exercise01;

import chapters.chapter11.Exercise01.Triangle;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle.");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color.");
        String color = input.nextLine();

        System.out.println("Is the triangle filled or not ? - true or false :");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        triangle.toString();

    }
}
