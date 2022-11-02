package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount");
		double amount = input.nextDouble();
		System.out.println("Enter the annuel interest rate");
		double yield = input.nextDouble();		
		System.out.println("Enter the number of the months"); 
		double month = input.nextDouble();
		double total = 0;
		System.out.println("Month	CD VALUE");
		
		for(int i = 1 ; i <= month ; i++) {
			amount = amount * (1 + (yield / 1200)) ;
			System.out.print(i + "	" );	
			System.out.printf("%4.2f",amount);
			System.out.println();
		}
		
	}

}
