package chapters.Chapter05.Exercises;

public class Exercise15 {

	public static void main(String[] args) {

		int count = 1 ;
		
		for(int i = 33 ; i <= 126 ; i++) {
		if (count % 10 == 0) {
			
			System.out.println((char)(i) + " ");
		}else {
			System.out.print((char)(i) + " ");

		}
		count++;
		
		}
	}

}
