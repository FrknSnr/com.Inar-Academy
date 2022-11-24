package chapters.chapter12.Exercises.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two integers: ");
            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input!");
                input.nextLine();
            }
        }
    }
}