package chapters.chapter11.Exercise09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = input.nextInt();

        int[][] arr = fillTheArray(n);
        display(arr);

        ArrayList<Integer> sumOfCols = new ArrayList<>();
        ArrayList<Integer> sumOfRows = new ArrayList<>();

        // For columns :
        for (int col = 0; col < arr.length; col++) {
            int total = 0;
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][col];
            }
            sumOfCols.add(total);
        }
        // For rows :
        for (int row = 0; row < arr.length; row++) {
            int total = 0;
            for (int col = 0; col < arr.length; col++) {
                total += arr[row][col];
            }
            sumOfRows.add(total);
        }
        ArrayList<Integer> maxCols = findTheMaxCol(sumOfCols);
        ArrayList<Integer> maxRows = findTheMaxRow(sumOfRows);

        System.out.print("The largest row index: ");
        for (int i = 0; i < maxRows.size(); i++) {
            System.out.print(maxRows.get(i)+" ");
        }
        System.out.println();

        System.out.print("The largest column index: ");
        for (int i = 0; i < maxCols.size(); i++) {
            System.out.print(maxCols.get(i)+ " ");
        }





    }
    public static ArrayList<Integer> findTheMaxCol(ArrayList<Integer> sumOfCols) {
        ArrayList<Integer> maxs = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < sumOfCols.size(); i++) {
            if (sumOfCols.get(i) > max) {
                max = sumOfCols.get(i);
            }
        }
        for (int i = 0; i < sumOfCols.size(); i++) {
            if (max == sumOfCols.get(i)){
                maxs.add(i);
            }
        }return maxs ;
    }

    public static ArrayList<Integer> findTheMaxRow(ArrayList<Integer> sumOfRows) {
        ArrayList<Integer> maxs = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < sumOfRows.size(); i++) {
            if (sumOfRows.get(i) > max) {
                max = sumOfRows.get(i);
            }
        }
        for (int i = 0; i < sumOfRows.size(); i++) {
            if (max == sumOfRows.get(i)){
                maxs.add(i);
            }
        }return maxs ;
    }


    public static int[][] fillTheArray(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
