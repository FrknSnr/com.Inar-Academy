package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The 16 bits are ");

        for (int i = 15; i >= 0; i--) {
            System.out.print((number >> i) & 1);

        }
    }
}
