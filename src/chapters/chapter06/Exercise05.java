package chapters.chapter06;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double number1 = input.nextDouble();
        System.out.println("The second : ");
        double number2 = input.nextDouble();
        System.out.println("The third : ");
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3);

    }

    public static void displaySortedNumbers(double n1, double n2, double n3) {
        double temp = 0;
        if (n2 < n1) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }
        if (n3 < n1) {
            temp = n3;
            n3 = n1;
            n1 = temp;
        }
        if (n3 < n2) {
            temp = n3 ;
            n3 = n2 ;
            n2 = temp ;
        }
        System.out.println( n1 +" " + n2 + " " + n3 );
    }
}
