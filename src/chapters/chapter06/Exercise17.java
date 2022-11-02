package chapters.chapter06;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 'n' ");
        int i = input.nextInt();
            printMatrix(i);
    }
    public static void printMatrix(int n) {
        int count = 0;
        for (int i = 1; i <= Math.pow(n, 2); i++) {
            count++;
            if (count % n == 0) {
                System.out.println((int)(Math.random() * 2));
            }else
                System.out.printf("%-2d", (int) (Math.random() * 2));
        }
    }
}
