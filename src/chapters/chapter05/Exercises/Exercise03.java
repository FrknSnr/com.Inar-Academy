package chapters.Chapter05.Exercises;

public class Exercise03 {

	public static void main(String[] args) {
		System.out.println("Kilograms           Pounds");
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%-9d%17.1f", i, (i * 2.2));
			System.out.println();

		}

	}
}
