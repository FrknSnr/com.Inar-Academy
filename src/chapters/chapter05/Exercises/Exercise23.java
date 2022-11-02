package chapters.Chapter05.Exercises;

public class Exercise23 {

	public static void main(String[] args) {
		
	double sum  = 0;	
	double sum1 = 0;
	
	for(int n = 50000 ; n > 0 ; n--) {
		sum += 1.0 / n ; 
		
		
	}for(int i = 1  ; i <= 50000; i++) {
		sum1 += 1.0/i ;
	}

	System.out.println("From right to left :" + sum);
		System.out.println("From left to right :" + sum1);
		
		
		
	}

}
