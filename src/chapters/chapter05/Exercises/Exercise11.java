package chapters.Chapter05.Exercises;

public class Exercise11 {

	public static void main(String[] args) {

		System.out.println("The numbers divisible by 5 or 6 but not both are : ");
		int line = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				line++;
				if (line % 10 == 0) {
					System.out.println(i + " ");
				} else
					System.out.print(i + " ");

			}

		}

	}
}
