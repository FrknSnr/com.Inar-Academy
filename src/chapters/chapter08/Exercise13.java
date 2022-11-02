package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        double[][] array = getArr();
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int[] locateGreatests = locateLargest(array);
        display(locateGreatests);

    }

    public static void display(int[] greatest) {
        System.out.println(Arrays.toString(greatest));
    }

    private static int[] locateLargest(double[][] array) {
        int[] largest = new int[2];
        double max = 0;
        largest[0] = 0;
        largest[1] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    largest[0] = i;
                    largest[1] = j;
                }
            }
        }
        return largest;
    }

    private static double[][] getArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array : ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] arr = new double[row][col];
        System.out.println("Enter the array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }
}
