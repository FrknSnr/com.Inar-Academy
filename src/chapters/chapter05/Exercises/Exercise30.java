package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount");
		double amount = input.nextDouble();
		System.out.println("Enter the annuel interest rate");
		double rate = input.nextDouble();		
		System.out.println("Enter the number of the months"); 
		double month = input.nextDouble();
		double total = 0;
		
		for(int i = 0 ; i < month ; i ++) {
			total += amount * (1 + (rate / 12)) ;
			
		}System.out.print("Amount in the savings after " + month + " months is : " );
		System.out.printf("%4.3f", total );
		
		
		
	}

}
