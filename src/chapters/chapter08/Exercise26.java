package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        double[][] matrix = getFromUser();
        double[][] sorted = sortRows(matrix);
        System.out.println("The original array is : ");
        display(matrix);
        System.out.println("The row-sorted array is : ");
        display(sorted);

    }

    public static void display(double[][] sorted) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(sorted[i]));
        }
    }

    public static double[][] sortRows(double[][] m) {
        double[][] sorted = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            System.arraycopy(m[i], 0, sorted[i], 0, m[i].length);
        }
        for (int i = 0; i < 3; i++) {
            sorted[i] = getInRow(sorted[i]);
        }
        return sorted;
    }

    public static double[] getInRow(double[] sorted) {
        for (int i = 0; i < 2; i++) {
            double min = sorted[i];
            int minIndex = i;
            for (int j = i + 1; j < 3; j++) {
                if (min > sorted[j]) {
                    min = sorted[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                sorted[minIndex] = sorted[i];
                sorted[i] = min;
            }
        }
        return sorted;
    }


    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}

