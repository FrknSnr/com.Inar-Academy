package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers .The input ends if it is 0 :");
		int negatives = 0;
		int positives = 0;
		double sum = 0;
		int number = 0;
		int i = input.nextInt();

		while (i != 0) {
			if (i < 0) {
				negatives++;
			} else {
				positives++;

			}
			number++;
			sum += i;
			i = input.nextInt();

		}
		System.out.println("The number of positives is : " + positives);
		System.out.println("The number of negatives is : " + negatives);
		System.out.println("The sum is : " + sum);
		System.out.println("The average is : " + sum /number);

	}

}
