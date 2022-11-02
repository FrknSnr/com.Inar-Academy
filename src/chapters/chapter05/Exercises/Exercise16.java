package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = input.nextInt();	
		int diviser = 2 ;
		System.out.println("The smallest factors are : ");
		
		while(number != 1) {
			if(number % diviser == 0) {
				System.out.print(diviser + ", ");
				number /= diviser ;
			}else
				diviser++;
			
		}

		
		
		
		}

}
