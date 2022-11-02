package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values :");
        int numberOfVal = input.nextInt();
        int[] values = createArr(numberOfVal);
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours .");
        } else System.out.println("The list has no consecutive fours .");

    }

    public static int[] createArr(int number) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[number];
        System.out.println("Enter the values :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;

    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int consecutive = 1;
            for (int next = i + 1; next < values.length; next++) {
                if (values[i] == values[next]) {
                    consecutive++;
                } else break;
            }
            if (consecutive >= 4)
                return true;
        }
        return false;
    }
}
