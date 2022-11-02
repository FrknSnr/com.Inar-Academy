package chapters.chapter08;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        System.out.println("Enter list 1 :");
        int[][] arr1 = getFromUser();
        System.out.println("Enter list 2 :");
        int[][] arr2 = getFromUser();
        if (equals(arr1, arr2)) {
            System.out.println("The two arrays are strictly identical.");
        } else System.out.println("The two arrays are not strictly identical.");

    }

    public static boolean equals(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
