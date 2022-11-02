package chapters.chapter05.Exercises;

public class Exercise18D {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 7 - i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}

	}

}
