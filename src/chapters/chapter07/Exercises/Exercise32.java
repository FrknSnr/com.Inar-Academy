package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list : ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int pivot = partition(list);
        lineUp(list, pivot);

    }

    public static int partition(int[] list) {
        return list[0];

    }

    public static void lineUp(int[] list, int pivot) {
        int biggers = 0;
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < pivot) {
                newList[biggers] = list[i];
                biggers++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= pivot) {
                newList[biggers] = list[i];
                biggers++;
            }
        }
        System.out.println(Arrays.toString(newList));
    }
}
