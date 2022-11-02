package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511 : ");
        int number = input.nextInt();
        int[] binary = toBinary(number);
        System.out.println(Arrays.toString(binary));
        display(binary);
    }

    public static int[] toBinary(int number) {
        int[] binary = new int[9];
        int i = binary.length - 1;
        while (number > 0) {
            binary[i] = number % 2;
            number /= 2;
            i--;
        }
        return binary;
    }

    public static void display(int[] binary) {
        int count = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                if (count % 3 == 2) {
                    System.out.println("H");
                } else System.out.printf("%-2s", "H");
            } else {
                if (count % 3 == 2) {
                    System.out.println("T");
                } else
                    System.out.printf("%-2s", "T");
            }
            count++;
        }
        // OR ANOTHER WAY TO DO IT :

        int a = 0;
        char[][] newBinary = new char[3][3];
        for (int i = 0; i < newBinary.length; i++) {
            for (int j = 0; j < newBinary[i].length; j++, a++) {
                if (binary[a] == 0)
                    newBinary[i][j] = 'H';
                else newBinary[i][j] = 'T';
            }
        }
        for (int i = 0; i < newBinary.length; i++) {
            System.out.println(Arrays.toString(newBinary[i]));
        }
    }
}







