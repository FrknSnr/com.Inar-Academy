package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal integer :");
		int decimal = input.nextInt();
		String binary = "";

		while( decimal >= 1 ) {
			binary = (decimal % 2) + binary ;
			decimal /= 2 ;
		}
		System.out.println(binary);
				
			

		

	}

}
