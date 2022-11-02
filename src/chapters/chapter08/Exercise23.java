package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        int[][] arr = createArr();
        int[] violated = checkViolated(arr);
        System.out.println("The flipped cell is at " + Arrays.toString(violated));

    }

    public static int[] checkViolated(int[][] arr) {
        int[] violated = new int[2];
        violated[0] = checkViolatedRow(arr);
        violated[1] = checkViolatedCol(arr);
        return violated;
    }

    private static int checkViolatedCol(int[][] arr) {
        int violatedCol = -1;
        for (int col = 0; col < arr[0].length; col++) {
            int count = 0;
            for (int[] row : arr) {
                if (row[col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                violatedCol = col;
            }
        }
        return violatedCol;
    }

    public static int checkViolatedRow(int[][] arr) {
        int violatedRow = -1;
        for (int row = 0; row < arr.length; row++) {
            int count = 0;
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                violatedRow = row;
            }
        }
        return violatedRow;
    }

    public static int[][] createArr() {
        int[][] arr = new int[6][6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row : ( 0 or 1 )");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

}
