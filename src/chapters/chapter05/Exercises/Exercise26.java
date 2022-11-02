package chapters.Chapter05.Exercises;

public class Exercise26 {

	public static void main(String[] args) {

		for (int i = 10000; i <= 100000; i += 10000) {
			double sum = 1 ;
			
			for(int k = 3 , j = 1; k <= (2 * i - 1) ; k += 2 , j++) {
				
				sum += Math.pow(-1, j) / k ;
				
				
			}System.out.println("Pi for i => " + i + " is " + 4 * sum);
			
		}

	}

}
