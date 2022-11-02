package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        int NUM_OF_INPUTS = 10;
        int[] numbers = createArray(NUM_OF_INPUTS);
        int[] eliminated = eliminateDuplicates(numbers);
        display(eliminated);

    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminated = new int[list.length];
        Arrays.fill(eliminated, -1);
        int countOfEliminated = 0;
        for (int i = 0; i < list.length; i++) {
            if (isDifferent(eliminated, list[i], countOfEliminated)) {
                eliminated[countOfEliminated] = list[i];
                countOfEliminated++;
            }
        }
        return eliminated;
    }

    public static boolean isDifferent(int[] eliminated, int listNumber, int countOfEliminated) {
        for (int i = 0; i < countOfEliminated; i++) {
            if (eliminated[i] == listNumber)
                return false;
        }
        return true;
    }

    public static int[] createArray(int numOfInputs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers :");
        int[] numbers = new int[numOfInputs];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static void display(int[] eliminatedNumbers) {
        sort(eliminatedNumbers);
        for (int i : eliminatedNumbers) {
            if (i != -1)
                System.out.print(i + " ");
        }
    }

    public static void sort(int[] sortEliminated) {
        for (int i = 0 ; i < sortEliminated.length - 1 ; i++){
            int min = sortEliminated[i] ;
            int minIndex = i ;
            for (int j = i + 1 ; j < sortEliminated.length ; j++){
                if (min > sortEliminated[j]){
                    min = sortEliminated[j];
                    minIndex = j ;
                }
            }if (minIndex != i){
             sortEliminated[minIndex] = sortEliminated[i] ;
             sortEliminated[i] = min ;
            }
        }
    }

}