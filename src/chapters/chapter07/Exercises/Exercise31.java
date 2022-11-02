package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {

        int[] list1 = createArr();
        int[] list2 = createArr();
        int[] merged = merge(list1, list2);
        sort(merged);
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }

    public static int[] createArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list :");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            merged[i] = list1[i];
        }
        for (int i = 0, j = list1.length; i < list2.length; j++, i++) {
            merged[j] = list2[i];
        }
        return merged;
    }

    public static void sort(int[] merged) {
        for (int i = 0; i < merged.length - 1; i++) {
            int currentMin = merged[i];
            int minIndex = i;
            for (int j = i + 1; j < merged.length; j++) {
                if (currentMin > merged[j]) {
                    currentMin = merged[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                merged[minIndex] = merged[i];
                merged[i] = currentMin;
            }
        }

    }

}
