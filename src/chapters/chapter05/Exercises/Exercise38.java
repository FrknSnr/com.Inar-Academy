package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal integer :");
        int decimal = input.nextInt();
        String binary = "";

        while (decimal >= 1) {
            binary = (decimal % 8) + binary;
            decimal /= 8;
        }
        System.out.println(binary);


    }
}
