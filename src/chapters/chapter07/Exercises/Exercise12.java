package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        System.out.print("Enter ten numbers: ");
        double[] numbers = getNumbers();
        numbers = reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static double[] getNumbers() {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers ;
    }

    public static double[] reverseArray(double[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2 ; i++, j--) {
            double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }
}
