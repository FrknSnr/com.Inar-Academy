package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two positive integers :");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int temp = 0;
		if (number1 < number2) {
			temp = number2;
			number2 = number1;
			number1 = temp;
		}
		int gcd = 0;
		int d = number2;

		while (d > 0) {
			if (number1 % d == 0 && number2 % d == 0) {
				gcd = d;
				break;
			}
			d--;
		}
		System.out.println("The greatest common divisor is : " + gcd);

	}

}
