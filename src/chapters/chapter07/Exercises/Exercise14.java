package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        int[] numbers = createArray();
        int gcdNumber = gcd(numbers);
        System.out.println("The greatest common divisor is : " +  gcdNumber);
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers :");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int gcd(int... numbers) {

        int min = getMin(numbers);
        int gcd = 1;
        int divisor = 1;
        while (divisor <= min) {
            boolean isGcd = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisor != 0) {
                    isGcd = false;
                }
            }
            if (isGcd)
                gcd = divisor;
            divisor++;
        }
        return gcd;
    }

    public static int getMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;
    }

}
