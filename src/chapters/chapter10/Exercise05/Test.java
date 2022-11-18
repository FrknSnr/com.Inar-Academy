package chapters.chapter10.Exercise05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        StackOfIntegers factors = getFactors(num);
        displayFactorsAndReversed(factors);
    }

    private static void displayFactorsAndReversed(StackOfIntegers factors) {
        StackOfIntegers reversed = new StackOfIntegers();
        while (!factors.empty()) {
            System.out.print(factors.peek() + " ");
            reversed.push(factors.pop());
        }
        System.out.println();
    }

    public static StackOfIntegers getFactors(int n) {
        StackOfIntegers factors = new StackOfIntegers();
        int d = 2;
        while (n != 1) {
            if (n % d == 0) {
                factors.push(d);
                n /= d;
            } else {
                d++;
            }
        }
        return factors;
    }
}