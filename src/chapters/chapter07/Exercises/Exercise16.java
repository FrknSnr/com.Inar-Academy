package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        int[] arr = createArrey();
        int key = getKey(arr);
        long startTime = System.currentTimeMillis();
        linearSearch(arr, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        long startTime2 = System.currentTimeMillis();
        binarySearch(arr, key);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("Linear search time : " + executionTime + " and binary search time : " + executionTime2);
    }

    public static int getKey(int[] arr) {
        int key = (int) (Math.random() * Integer.MAX_VALUE);
        return key;
    }

    public static int[] createArrey() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return arr;
    }

    public static int linearSearch(int[] list, int key) {

        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {

        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

}


