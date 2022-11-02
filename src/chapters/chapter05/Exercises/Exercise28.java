package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year / 0 for sunday - 1 for monday - / ... ");
		int firstDay = input.nextInt();

		for (int month = 1; month <= 12; month++) {
			switch (month) {
				case 1:
					System.out.print("1, January");
					break;
				case 2:
					System.out.print("1, February");
					break;
				case 3:
					System.out.print("1, March");
					break;
				case 4:
					System.out.print("1, April");
					break;
				case 5:
					System.out.print("1, May");
					break;
				case 6:
					System.out.print("1, June");
					break;
				case 7:
					System.out.print("1, July");
					break;
				case 8:
					System.out.print("1, August");
					break;
				case 9:
					System.out.print("1, September");
					break;
				case 10:
					System.out.print("1, October");
					break;
				case 11:
					System.out.print("1, November");
					break;
				case 12:
					System.out.print("1, December");
					break;
			}
			switch (firstDay % 7) {
				case 0:
					System.out.println(" Sunday");
					break;
				case 1:
					System.out.println(" Monday");
					break;
				case 2:
					System.out.println(" Tuesday");
					break;
				case 3:
					System.out.println(" Wednesday");
					break;
				case 4:
					System.out.println(" Thursday");
					break;
				case 5:
					System.out.println(" Friday");
					break;
				case 6:
					System.out.println(" Saturday");
					break;
			}
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				firstDay += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				firstDay += 30;
			else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					firstDay += 29;
				else
					firstDay += 28;

			}
		}





		}

}
