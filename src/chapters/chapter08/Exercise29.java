package chapters.chapter08;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {

        System.out.println("Enter list 1 :");
        int[][] arr1 = getFromUser();
        System.out.println("Enter list 2 :");
        int[][] arr2 = getFromUser();
        if (equals(arr1, arr2)) {
            System.out.println("The two arrays are identical.");
        } else System.out.println("The two arrays are not identical.");

    }

    public static boolean equals(int[][] arr1, int[][] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum1 += arr1[i][j];
                sum2 += arr1[i][j];
            }
        }
        if (sum1 != sum2){
            return false ;
        }
        int count ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (arr1[i][j] == arr2[k][l]){
                            count++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean isIdentical(int number, int[][] arr2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == arr2[i][j]) {
                    return true;
                }
            }
        }
        return false;
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


