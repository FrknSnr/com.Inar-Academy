package chapters.chapter08;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household//
        };
        int status = getStatus();
        double tax = computeTax(status, rates, brackets);

    }

    public static double computeTax(int status, double[] rates, int[][] brackets) {
        int income = getIncome();
        int indexOfIncome = 0;
        for (int i = 0; i < 4; i++) {
            if (income > brackets[status][i]) {
                indexOfIncome = i;
            }
        }
        double tax = 0;
        for (int i = indexOfIncome; i >= 0; i--) {
            tax += ((income - brackets[status][indexOfIncome]) * rates[indexOfIncome + 1]);

        }return tax ;
    }




    public static int getIncome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your income :");
        return input.nextInt();
    }


    public static int getStatus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your status : ( 0 for single / 1 for married jointly / 2 for married separately / 3 for head of household ) ");
        int status;
        do {
            status = input.nextInt();
            if (status < 0 || status > 3) {
                System.out.println("Invalid input. Please enter a valid input : ");
            }
        } while (status < 0 || status > 3);
        return status;
    }
}
