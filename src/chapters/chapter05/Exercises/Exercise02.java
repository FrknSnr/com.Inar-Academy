package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the answer ");
		int numberOfQuestion = 0;
		int numberOfCorrects = 0;
		long time0 = System.currentTimeMillis();

		while (numberOfQuestion < 10) {
			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;
			System.out.println(number1 + "+" + number2);
			int answer = input.nextInt();
			if (answer == number1 + number2) {
				numberOfCorrects++;
				System.out.println("You're correct!");
			} else
				System.out.println("Wrong !");
			numberOfQuestion++;
		}

		long time1 = System.currentTimeMillis();
		long time = (time1 - time0) / 1000;
		System.out.println("The correct count : " + numberOfCorrects);
		System.out.println("The time you spend : " + time + " seconds");
	}

}
