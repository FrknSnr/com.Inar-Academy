package chapters.chapter05.Exercises;

public class Exercise13 {

	public static void main(String[] args) {

		int n = 1 ;

		while(Math.pow(n,3) < 12000){
			n++;
		}

		System.out.println("The largest n such that n*n*n is less than 12000 is : " +( n - 1 ));
	
	
	}

}
