package chapters.chapter08;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        double[][] mar = createArr();
        if (isMarkovMatrix(mar)) {
            System.out.println("It is a Markov matrix.");
        } else System.out.println("It is not a Markov matrix.");

    }

    public static boolean isMarkovMatrix(double[][] m) {
        return isAllPositive(m) && isColumnSumOne(m);
    }

    private static boolean isColumnSumOne(double[][] m) {
        for (int col = 0; col < 3; col++) {
            double sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += m[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAllPositive(double[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static double[][] createArr() {
        double[][] mar = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mar[i][j] = input.nextDouble();
            }
        }
        return mar;
    }
}
