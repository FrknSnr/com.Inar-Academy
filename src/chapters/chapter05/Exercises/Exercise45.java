package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers  ");
        double mean = 0;
        double totalNumber = 10;
        double first = 0;
        int sum = 0 ;


        for (int i = 0 ; i < totalNumber ; i++) {
            double number = input.nextDouble();
            System.out.println("Enter an integer");
            first += Math.pow(number, 2) ;
            sum += number ;
            mean += (number / totalNumber);
        }
        double deviation = Math.sqrt((first - (Math.pow(sum, 2) / totalNumber)) / (totalNumber - 1));
        System.out.println("The mean is : " + mean  );
        System.out.println("The deviation is : " + deviation );
    }
}




