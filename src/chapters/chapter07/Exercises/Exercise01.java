package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numbers = input.nextInt();
        int[] scores = new int[numbers];
        System.out.println("Enter the scores :");
        for (int i = 0; i < numbers; i++) {
            scores[i] = input.nextInt();
        }
        int best = best(scores, numbers);
        for (int a = 0; a < numbers; a++) {
            char grade = getGrade(scores[a], best);
            System.out.println("Student " + a + " score is " + scores[a] + " and grade is " + grade);
        }
    }

    public static int best(int[] scores, int numbers) {
        int best = 0;
        for (int i = 0; i < numbers; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        return best;
    }

    public static char getGrade(int scores, int best) {
        if (scores >= best - 10) {
            return 'A';
        }
        if (scores >= best - 20) {
            return 'B';
        }
        if (scores >= best - 30) {
            return 'C';
        }
        if (scores >= best - 40) {
            return 'D';
        }
        return 'F';
    }

}



