package chapters.chapter05.Exercises;

public class Exercise25 {

	public static void main(String[] args) {

		for (double i = 10000; i <= 100000; i += 10000) {
				double sum = 1 ;

				for (int k = 3 , j = 1; k <= (2 * i - 1 ) ; k +=2 , j++) {

					sum += Math.pow(-1, j) * 1 / k ;


			}System.out.println("Pi for i = " + i + " is = " + (4 * sum) );			
			
			
			
			
			
		}

	}
}
