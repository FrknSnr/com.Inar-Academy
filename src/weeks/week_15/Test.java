package weeks.week_15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        Calculator calculator = new Calculator(input.nextDouble(),input.nextDouble());

    }
}
