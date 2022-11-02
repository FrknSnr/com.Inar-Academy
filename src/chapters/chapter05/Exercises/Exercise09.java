package chapters.Chapter05.Exercises;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = input.nextInt();
		double highestScore = 0;
		double secondScore = 0;
		String highestName = "";
		String secondName = "";
		
		for (int i = 0; i < number; i++) {
			System.out.println("Enter first the name of the student then the score :");
			String name = input.next();
			Double score = input.nextDouble();
			
			if (score < highestScore && score >= secondScore) {
				secondScore = score ;
				secondName= name;
			}if(score >= highestScore) {
				secondName = highestName ;
				secondScore = highestScore ;
				highestName = name ;
				highestScore = score ;
			}
		}
		System.out.println("The highest score is : " + highestScore +"=>"+ highestName);
		System.out.println("The second score is : " + secondScore +"=>"+ secondName );
	}

}


