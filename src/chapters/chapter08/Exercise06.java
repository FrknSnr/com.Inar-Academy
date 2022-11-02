package chapters.chapter08;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println("Enter matrix1 : ");
        double[][] matrix1 = createMatrix();
        System.out.println("Enter matrix2 : ");
        double[][] matrix2 = createMatrix();
        double[][] multiplyMatrix = multiplyMatrices(matrix1, matrix2);
        display(multiplyMatrix);
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;

    }

    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                multiplyMatrix[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j]) + (matrix1[i][2] * matrix2[2][j]);
            }
        }
        return multiplyMatrix;


    }

    public static void display(double[][] multiplyMatrix) {
        System.out.println("The multiplication of the matrices is : ");
        for (int i = 0; i < multiplyMatrix.length; i++) {
            int count = 0;
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                if (count % 3 == 2) {
                    System.out.println(multiplyMatrix[i][j]);
                } else System.out.printf("%-6.2f%s", multiplyMatrix[i][j]," ");
                count++;
            }

        }
    }
}
