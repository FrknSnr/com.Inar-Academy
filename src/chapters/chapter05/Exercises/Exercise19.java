package chapters.chapter05.Exercises;

public class Exercise19 {

	public static void main(String[] args) {

		for( int i = 1 ; i <= 8 ; i++ ){
			for(int j = i ; j < 8 ; j++){
				System.out.print("    ");
			}for( int k = 0 ; k < i ; k++){
				System.out.printf("%4d",(int)Math.pow(2, k));
			}for (int l = i ; l > 1 ; l-- ){
				System.out.printf("%4d",(int)Math.pow(2,l-2));
			}

			System.out.println();
		}

	}

}
