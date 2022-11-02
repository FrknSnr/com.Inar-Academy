package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        double[][] matrix = getFromUser();
        double[][] newMatrix = sortColumns(matrix);
        double[][] sortedCol = changeLocations(newMatrix);
        System.out.println("The original array is : ");
        display(matrix);
        System.out.println("The column-sorted array is : ");
        display(sortedCol);

    }

    public static void display(double[][] arr) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] newMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newMatrix[j][i] = m[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            newMatrix[i] = sort(newMatrix[i]);
        }
        return newMatrix ;
    }

    public static double[][] changeLocations(double[][] rowSorted) {
        double[][] colSorted = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                colSorted[j][i] = rowSorted[i][j];
            }
        }
        return colSorted;
    }

    public static double[] sort(double[] arr) {
        for (int i = 0; i < 2; i++) {
            double min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < 3; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }
}

