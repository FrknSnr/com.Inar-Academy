package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pcCount = 0;
		int playerCount = 0;

		while (pcCount < 2 || playerCount < 2) {
			int pc = (int) (Math.random() * 3);
			System.out.print(" Enter 0 for scissor , 1 for rock , 2 for paper : ");
			int player = input.nextInt();

			if (pc == 0) {
				System.out.print("The pc is scissors and you are : ");
				if (player == 0) {
					System.out.println("scissors also. ");
				}
				if (player == 1) {
					playerCount++;
					System.out.println("rock !");
				}
				if (player == 2) {
					pcCount++;
					System.out.println("paper. ");
				}
				System.out.println("You are : " + playerCount + " and the pc is : " + pcCount);
			}
			if (pc == 1) {
				System.out.print("The pc is rock and you are : ");
				if (player == 0) {
					pcCount++;
					System.out.println("scissors .");
				}
				if (player == 1) {
					System.out.println("rock also . ");
				}
				if (player == 2) {
					playerCount++;
					System.out.println("paper. ");
				}
				System.out.println("You are : " + playerCount + " and the pc is : " + pcCount);
			}
			if (pc == 2) {
				System.out.print("The pc is paper and you are : ");
				if (player == 0) {
					playerCount++;
					System.out.println("scissors. ");
				}
				if (player == 1) {
					pcCount++;
					System.out.println("rock .");
				}
				if (player == 2) {
					System.out.println("paper also.");
				}
				System.out.println("You are : " + playerCount + " and the pc is : " + pcCount);

			}
			if (pcCount == 2 || playerCount == 2) {
			break;
			}
		}
		if (pcCount < playerCount) {
			System.out.println("You won the game !");
		} else
			System.out.println("Sorry guy ! Pc has won !");

	}
}