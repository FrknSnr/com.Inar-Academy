package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = input.nextInt();
		double highestScore = 0;
		String highestName = "";

		for (int i = 0; i < number; i++) {
			System.out.println("Enter first the name of the student then the score :");
			String name = input.next();
			Double score = input.nextDouble();
			
			if (score > highestScore) {
				highestScore = score;
				highestName = name;
			}
		}
		System.out.println("The highest score is : " + highestScore  + " - " + highestName );
	}

}
