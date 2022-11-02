package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c values : ");
        double[] values = new double[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        double root1 = (-values[1] + Math.pow(Math.pow(values[1], 2) - (4 * values[0] * values[2]), 0.5)) / (2 * values[0]);
        double root2 = (-values[1] - Math.pow(Math.pow(values[1], 2) - (4 * values[0] * values[2]), 0.5)) / (2 * values[0]);

        if (hasRoots(values)) {
            if (oneRoot(values)) {
                System.out.println("The equation has one real root : " + root1);
            } else {
                System.out.println("The equation has two real roots : " + root1 + " and " + root2);
            }
        } else
            System.out.println("The equation has no real roots.");
    }

    public static boolean hasRoots(double[] values) {
        double discriminant;
        discriminant = Math.pow(values[1], 2) - (4 * values[0] * values[2]);
        return !(discriminant < 0);
    }

    public static boolean oneRoot(double[] values) {
        double discriminant;
        discriminant = Math.pow(values[1], 2) - (4 * values[0] * values[2]);
        return discriminant == 0;
    }

}
