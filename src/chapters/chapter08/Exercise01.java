package chapters.chapter08;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        System.out.println("Enter a 3-by-4 matrix row by row : ");
        double[][] matrix = createArr();
        for (int col = 0; col < matrix[2].length; col++) {
            double sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }

            System.out.println("The sum of " + (col + 1) + ". column is : " + sum);
        }

    }

    public static double[][] createArr() {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = input.nextDouble();
            }
        }
        return arr;
    }
}
