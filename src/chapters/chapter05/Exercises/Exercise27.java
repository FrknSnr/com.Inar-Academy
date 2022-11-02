package chapters.chapter05.Exercises;

public class Exercise27 {

	public static void main(String[] args) {
		int line = 0;

		for (int year = 101; year <= 2100; year ++) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear) {
				line++;

				if (line % 10 == 0)
					System.out.println(year);
				else
					System.out.print(year + " ");

			} 

		}System.out.println("\nThe number of leap years :" + line);
	}

}
