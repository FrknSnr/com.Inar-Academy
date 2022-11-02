package chapters.chapter08;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {

        double[][] points = getPoints();
        display(points);
    }

    public static void display(double[][] points) {
        double area = getTriangleArea(points);
        if (area == 0) {
            System.out.println("The three points are on the same line.");
        } else
            System.out.printf("The area of the triangle is %.2f ", area);
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2)
                + Math.pow(points[1][1] - points[0][1], 2), 0.5);

        double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2
        ) + Math.pow(points[2][1] - points[1][1], 2), 0.5);

        double side3 = Math.pow(Math.pow(points[2][0] - points[0][0], 2)
                + Math.pow(points[2][1] - points[0][1], 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;

    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.println("Enter the points :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
