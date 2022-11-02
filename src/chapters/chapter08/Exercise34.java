package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {

        double[][] points = getFromUser();
        double[] lowest = getRightmostLowestPoint(points);
        display(lowest);
    }

    public static void display(double[] lowest) {
        System.out.println(Arrays.toString(lowest));
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] lowest = new double[2];
        for (int i = 0; i < 6; i++) {
            double min = points[i][0];
            int minIndex = 0;
            for (int j = 0; j < 2; j++) {
                if (min > points[i][j]) {
                    min = points[i][j];
                    minIndex = i;
                }
            }
            lowest[0] = minIndex;
            lowest[1] = min;

        }
        return lowest;
    }


    public static double[][] getFromUser() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 points : ");
        double[][] points = new double[6][2];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

}
