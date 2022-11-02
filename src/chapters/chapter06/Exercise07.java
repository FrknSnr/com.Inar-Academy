package chapters.chapter06;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("The amount invested : ");
        double amount = input.nextDouble();

        System.out.println("Annual interest rate : ");
        double annualInterestRate = input.nextDouble() ;

        double monthlyInterestRate = annualInterestRate / 1200 ;

        System.out.printf("%-10s%-10s\n","Years", "Future Value");
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-10d%-10.2f\n", years, futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double a = Math.pow((1 + monthlyInterestRate) , years * 12 );
        return a * investmentAmount ;

    }
}
