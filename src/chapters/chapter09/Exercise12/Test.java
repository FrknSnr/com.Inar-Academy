package chapters.chapter09.Exercise12;

import chapters.chapter09.Exercise11.LinearEquation;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        double[][] points = getPoints();
        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable()) {
            System.out.println("The two lines are parallel.");
        } else System.out.println("X is : " + equation.getX() + "\nY is : " + equation.getY());
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter the points : ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }


}
