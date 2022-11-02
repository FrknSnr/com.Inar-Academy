package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        int[][] arr = createArray();
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void sort(int[][] m) {
        int col = 0;
        for (int i = 0; i < m.length - 1; i++) {
            int currentMin = m[i][col];
            int[] min = m[i];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (currentMin > m[j][col]) {
                    min = m[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                m[minIndex] = m[i];
                m[i] = min;
            }
        }
        for (int i = 0; i < m.length - 1; i++) {
            int[] min = m[i];
            int minIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (m[i][0] == m[i + 1][0]) {
                    if (m[i][1] > m[j][1]) {
                        min = m[j];
                        minIndex = j;
                    }
                }
            }
            if (minIndex != i) {
                m[minIndex] = m[i];
                m[i] = min;
            }
        }
    }


    public static int[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = input.nextInt();
        System.out.println("Enter the number of columns.");
        int col = input.nextInt();
        System.out.println("Enter the array :");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}

