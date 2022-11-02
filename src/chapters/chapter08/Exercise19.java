package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        int[][] arr = createArr();
        display(arr);
        if (isConsecutiveFour(arr)) {
            System.out.println("True.");
        } else System.out.println("False.");
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static boolean isConsecutiveFour(int[][] values) {
        return isRow(values) || isCol(values) || isConsecutiveDiagonal(values);
    }

    private static boolean isRightDiagonal(int row, int column, int[][] matrix) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[0].length - 3) {
            return false;
        }
        int number = matrix[row][column];
        for (int i = 1; i < 4; i++) {
            if (number != matrix[row + i][column + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] matrix) {
        if (row > matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }
        int number = matrix[row][column];
        for (int i = 1; i < 4; i++) {
            if (number != matrix[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveDiagonal(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (isLeftDiagonal(i, j, values)) {
                    return true;
                }
                if (isRightDiagonal(i, j, values)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCol(int[][] values) {
        for (int i = 0; i < values[0].length; i++) {
            int count = 0;
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j][i] == values[j + 1][i]) {
                    count++;
                } else count = 1;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRow(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int count = 1;
            for (int j = 0; j < values[i].length - 1; j++) {
                if (values[i][j] == values[i][j + 1]) {
                    count++;
                } else count = 1;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }


    public static int[][] createArr() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = input.nextInt();
        System.out.println("Enter the number of columns.");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
}