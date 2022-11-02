package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        System.out.println("Enter matrix1 : ");
        double[][] matrix1 = createMatrix();
        System.out.println("Enter matrix2 : ");
        double[][] matrix2 = createMatrix();
        double[][] sumMatrix = sumMatrices(matrix1, matrix2);
        display(sumMatrix);
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

    public static double[][] sumMatrices(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;

    } public static void display(double[][] sumMatrix){
        for (int i = 0 ; i < sumMatrix.length ; i++){
            System.out.println(Arrays.toString(sumMatrix[i]));
        }

    }
}
