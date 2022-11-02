package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (ends with negative) .");
        int[] scores = new int[100];
        int total = 0;
        int count = 0;
        int num;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0) {
                break;
            }
            count++;
            total += num;
            scores[i] = num;
        }
        int average = average(total, count);
        displayResults(average, scores, count);
    }

    public static int average(int total, int count) {
        return total / count;
    }

    public static void displayResults(int average, int[] scores, int count) {
        int belowAverage = 0;
        int overAverage = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] < average) {
                belowAverage++;
            } else
                overAverage++;
        }
        System.out.println("The number of students : " + count);
        System.out.println("The average is : " + average);
        System.out.println("The number of students below the average is : " + belowAverage + "\n" +
                "The number of students over the average is : " + overAverage);

    }
}
