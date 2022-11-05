package chapters.chapter09.Exercise13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        double[][] arr = getArr();
        Location l = locateLargest(arr);
        l.display();


    }

    public static Location locateLargest(double[][] a) {
        double max = Double.MIN_VALUE;
        int r = -1;
        int c = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        return new Location(r, c, max);
    }

    public static double[][] getArr() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array : ");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("Enter the array :");
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }

}
