package chapters.chapter08;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        double[][] points = getFromUser();
        if (sameLine(points)) {
            System.out.println("The five points are on the same line.");
        } else System.out.println("The five points are not on the same line.");

    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points : ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    public static boolean sameLine(double[][] points) {
        boolean isSameLine = true;
        double result;
        for (int i = 2; i < points.length; i++) {
            result = ((points[1][0] - points[0][0]) * (points[i][1] - points[0][1])) - ((points[i][0] - points[0][0]) * (points[1][1] - points[0][1]));
            if (result == 0) {
                continue;
            } else {
                isSameLine = false;
                break;
            }
        }
        return isSameLine;
    }
}
