package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {

        int[][] matrix = createArr();
        int[] largest = findLargestBlock(matrix);
        System.out.println(Arrays.toString(largest));

    }

    public static int[] findLargestBlock(int[][] m) {
        int[] largest = new int[3];
        int[] count = new int[100];
        int index = 0;
        int max = -1;
        int originCol = -1;
        int num = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == num) {
                    if (isOne(i, j, m[i][j], m)) {
                        count[i]++;
                        if (count[i] > index) {
                            max = i;
                            originCol = j;
                        }
                    }
                }
            }
        }
        largest[0] = max;
        largest[1] = originCol;
        largest[2] = ++count[max];
        return largest;
    }

    public static boolean isOne(int row, int col, int number, int[][] m) {
        for (int i = 1; i < m.length; i++) {
            while (col + i < m.length) {
                if (number == m[row][col + i]) {
                    if (isSquare(row, col, i, m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSquare(int row, int col, int gap, int[][] m) {
        if (col + gap > m[0].length) {
            return false;
        }

        if (row + gap > m.length) {
            return false;
        }
        for (int i = row; i <= row + gap; i++) {
            for (int j = col; j < col + gap; j++) {
                if (m[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }


    public static int[][] createArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = input.nextInt();
        int[][] arr = new int[row][row];
        System.out.println("Enter the matrix row by row :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
