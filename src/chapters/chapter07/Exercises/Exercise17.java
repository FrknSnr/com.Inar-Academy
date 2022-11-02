package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int number = input.nextInt();
        String[] names = namesArray(number);
        double[] scores = scoresArray(number);
        displayStudentsNames(names, scores, number);
    }

    public static String[] namesArray(int numbers) {
        String[] names = new String[numbers];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names : ");
        for (int i = 0; i < numbers; i++) {
            names[i] = input.next();
        }
        return names;
    }

    public static double[] scoresArray(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the scores :");
        double[] scores = new double[number];
        for (int i = 0; i < number; i++) {
            scores[i] = input.nextDouble();
        }
        return scores;
    }

    public static void displayStudentsNames(String[] names, double[] scores, int number) {
        for (int i = 0; i < number; i++) {
            double currentMax = scores[i];
            int index = i;
            String student = names[i];
            for (int j = i + 1; j < number; j++) {
                if (scores[j] > currentMax) {
                    currentMax = scores[j];
                    student = names[j];
                    index = j;
                }
            }
            // Exchange their position
            if (i != index) {
                names[index] = names[i];
                scores[index] = scores[i];
                names[i] = student;
                scores[i] = currentMax;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] + " takes " + scores[i]);
        }

    }
}
