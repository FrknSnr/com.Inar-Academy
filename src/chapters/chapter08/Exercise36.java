package chapters.chapter08;

import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {
        System.out.println("Enter number n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] latin = new int[n][n];
        System.out.println("Enter " + n + " row of letters separated by spaces :");

        for (int i = 0; i < latin.length; i++) {
            for (int j = 0; j < latin.length; j++) {
                String s = input.next().toUpperCase();
                if (s.length() != 1) {
                    System.out.println("Wrong input : Please enter separated letters.");
                    j--;
                } else
                    latin[i][j] = s.charAt(0);
            }
            if (!isUniqueLetters(latin[i])) {
                System.out.println("Wrong row arrangement.");
                System.exit(1);
            }
            if (!isLatinSquare(latin[i])) {
                System.out.println("Wrong input: the letters must be from A to " +(char)('A' + n-1));
                System.exit(2);
            }
        }
        if (!checkColumns(latin)) {
            System.out.println("Wrong column arrangement ");
            System.exit(3);
        }
        System.out.println("The input array is a Latin square\n ");
    }

    public static boolean checkColumns(int[][] latin) {
        for (int col = 0; col < latin.length; col++) {
            for (int row = 0; row < latin.length; row++) {
                int number = latin[row][col];
                int count = 0;
                for (int i = 0; i < latin.length; i++) {
                    if (number == latin[i][col]) {
                        count++;
                        if (count > 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }


    public static boolean isLatinSquare(int[] latin) {
        for (int i = 0; i < latin.length; i++) {
            if (!('A' <= latin[i] && latin[i] < 'A' + latin.length)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueLetters(int[] latin) {
        for (int i = 0; i < latin.length; i++) {
            int number = latin[i];
            int count = 0;
            for (int j = 0; j < latin.length; j++) {
                if (number == latin[j]) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
