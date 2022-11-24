package chapters.chapter12.Exercises.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a,b ;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two integers : ");
            try {
                 a = input.nextInt();
                 b = input.nextInt();
                System.out.println("Sum : " + (a + b));
                break ;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input!");
                input.nextLine();
            }
        }
    }
}