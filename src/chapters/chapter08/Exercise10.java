package chapters.chapter08;

import java.util.Arrays;

public class Exercise10 {

    public static void main(String[] args) {
        int[][] matrix = createArr();
        int largestRowIndex = findTheLargestRow(matrix);
        int largestColIndex = findTheLargestCol(matrix);
        displayAll(matrix, largestRowIndex, largestColIndex);
    }

    public static int[][] createArr() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static int findTheLargestRow(int[][] matrix) {
        int maxRow = 0;
        int indexOfMax = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            maxRow += matrix[0][col];
        }
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                total += matrix[row][col];
            }
            if (total > maxRow) {
                maxRow = total;
                indexOfMax = row;
            }
        }
        return indexOfMax;
    }

    public static int findTheLargestCol(int[][] matrix) {
        int maxCol = 0;
        int maxColIndex = 0;
        for (int row = 0; row < matrix.length; row++) {
            maxCol += matrix[row][0];
        }
        for (int col = 0; col < matrix[0].length; col++) {
            int totalOfCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                totalOfCol += matrix[row][col];
            }
            if (totalOfCol > maxCol) {
                maxCol = totalOfCol;
                maxColIndex = col;
            }
        }
        return maxColIndex;
    }

    public static void displayAll(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("The largest row index : " + row);
        System.out.println("The largest col index : " + col);
    }

}
