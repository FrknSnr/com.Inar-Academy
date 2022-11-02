package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loan amount");
        double loanAmount = input.nextDouble();
        System.out.println("Enter the number of years:");
        int years = input.nextInt();
        System.out.println("Enter the annual interest rate :");
        int annualRate = input.nextInt();
        double monthlyInterestRate = annualRate / 1200.0;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * 12 * years;
        double principal, interest;
        System.out.printf("Monthly Payment is : %.2f\nTotal Payment is : %.2f\n",monthlyPayment, totalPayment );
        System.out.printf("%-12s%-15s%-17s%-9s\n", "Payment", "Interest", "Principal", "Balance");

        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyInterestRate * loanAmount;
            principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal;
            System.out.printf("%-12d%-15.2f%-17.3f%-9.2f\n", i, interest, principal, loanAmount);
        }
    }
}
