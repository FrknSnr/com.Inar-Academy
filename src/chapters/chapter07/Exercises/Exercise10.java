package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        double[] numbers = new double[10];
        System.out.println("Enter ten numbers :");
        getNumbers(numbers);
        int index = indexOfSmallestElement(numbers);
        System.out.println("Index of the smallest element is : " + index);
    }

    public static void getNumbers(double[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}