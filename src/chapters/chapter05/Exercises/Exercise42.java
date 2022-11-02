package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {

        int salary = 5000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Commission Sought");
        int commissionSought = input.nextInt();
        double commission = 0;
        double sale = 0;

        for (double sales = 0; commission <= commissionSought; sales += 0.1) {
            if (sales <= 5000) {
                commission =salary +  5000 * (8.0 / 100);
            } else if (sales <= 10000) {
                commission = salary + 5000 * (8.0 / 100) + ((sales - 5000) * (10.0 / 100));
            } else
                commission = salary + (5000 * (8.0 / 100)) + (5000) * (10.0 / 100) + ((sales - 10000) * (12.0 / 100));
            sale = sales ;
        }
        System.out.println("You must sale : " + sale );
    }
}
