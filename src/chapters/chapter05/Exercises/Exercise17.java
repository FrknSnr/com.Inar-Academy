package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int line = input.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = i; j < line; j++) {
				System.out.printf("%3s", " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.printf(i / k + "%2s", " ");
			}
			for (int l = 2; l <= i; l++) {
				System.out.printf(l + "%2s", " ");
			}
			System.out.println();
		}
	}
}

