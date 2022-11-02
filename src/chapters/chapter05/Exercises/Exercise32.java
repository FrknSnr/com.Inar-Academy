package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your guess");
		int guess = input.nextInt();
		int number = (int)( Math.random() * 90 ) + 10;
		double first = number % 10;
		double second = number / 10;

		while (first == second) {
			second = (int) Math.random() * 90 + 10;
			if(first != second) {
				break;
			}
		}
		int guessFirst = guess % 10;
		int guessSecond = guess / 10;
		System.out.println("The lottery number is " + number);
		if (guess == number) {
			System.out.println("Congrats! You won 10.000 dollars !");
		} else if (guessFirst == second && guessSecond == first) {
			System.out.println("Match all digits. You won 3.000 dollars !");
		} else if (guessFirst == first || guessFirst == second || guessSecond == first || guessSecond == second);

		else
			System.out.println("Sorry ! You won nothing hahahahahahaha !!!!!");

	}

}
