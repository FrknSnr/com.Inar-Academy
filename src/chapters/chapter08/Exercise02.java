package chapters.chapter08;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        double[][] matrix = createMatrix();
        double diagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is : " + diagonal);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row :");
        double[][] matrix = new double[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][row];
        }
        return sum;
    }
}

