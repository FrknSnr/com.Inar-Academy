package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        int[][] square = createArr();
        display(square);

        for (int row = 0; row < square.length; row++) {
            if (checkRow(square[row])) {
                if (square[row][0] == 0) {
                    System.out.println("All 0s on row " + row);
                } else
                    System.out.println("All 1s on row " + row);
            }
        }
        for (int col = 0; col < square.length; col++) {
            int num = square[0][col];
            int temp = -1;
            int count = 1;
            for (int row = 1; row < square.length; row++) {
                if (num == square[row][col]) {
                    count++;
                    temp = row;
                }
            }
            if (count == square.length) {
                if (square[temp][col] == 0) {
                    System.out.println("All 0s on col " + col);
                } else
                    System.out.println("All 1s on col " + col);
            }
        }
    }
    public static int[][] createArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of the square array :");
        int length = input.nextInt();
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }


    public static boolean checkRow(int[] square) {
        boolean isFour = false;
        int num = square[0];
        int count = 1;
        for (int i = 1; i < square.length; i++) {
            if (num == square[i]) {
                count++;
            }
            if (count == square.length) {
                isFour = true;
            }
        }
        return isFour;
    }

    public static void display(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            System.out.println(Arrays.toString(square[i]));
        }
    }
}
