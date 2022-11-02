package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {

        double[][] arr = new double[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a00, a01, a10, a11, b0, and b1");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        double[] b = new double[2];
        for (int i = 0; i < 2; i++) {
            b[i] = input.nextDouble();
        }

        double[] solution = linearEquation(arr,b);
        System.out.println(Arrays.toString(solution));
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
            System.out.println("The equation has no solution.");
            return null;
        }
       double[] solution = new double[2];
        solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        solution[1] = (b[1]) * a[0][0] - b[0] * a[1][0] / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return solution;
    }
}
