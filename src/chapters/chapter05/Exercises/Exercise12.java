package chapters.chapter05.Exercises;

public class Exercise12 {

	public static void main(String[] args) {

		int n = 0;

		while (Math.pow(n, 2) < 12000) {
			n++;

		}
		System.out.println( n + " is the smallest integer such that n * n > 12,000 ");

	}

}
