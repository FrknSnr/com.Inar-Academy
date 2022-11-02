package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers :");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
    }

    public static void reverse(int[] numbers) {
        int[] reverse = new int[10];
        for (int i = numbers.length - 1, a = 0; i >= 0; i--, a++) {
            reverse[a] = numbers[i];

        }
        System.out.println(Arrays.toString(reverse));

    }
}