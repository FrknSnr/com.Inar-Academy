package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers :");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double deviation = deviation(numbers);
        System.out.printf("%s%.5f", "The standard deviation is : ", deviation);
    }

    public static double deviation(double[] x) {
        double getMean = mean(x);
        System.out.printf("%s%.2f\n", "The mean is : ", getMean);
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result += Math.pow((x[i] - getMean), 2) / (x.length - 1);
        }
        return Math.pow(result, 0.5);
    }

    public static double mean(double[] x) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }


}
