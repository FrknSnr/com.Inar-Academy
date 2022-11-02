package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        int[] list1 = getList1();
        int[] list2 = getList2();

        if (equals(list1, list2)) {
            System.out.println("Two list are identical.");
        } else System.out.println("Two list are not identical.");
    }

    public static int[] getList1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list 1 :");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        return list1;
    }

    public static int[] getList2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list 2 :");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        return list2;
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        sort(list1);
        sort(list2);
        for (int i = 0; i < list2.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    minIndex = j;
                }
            }
            if (currentMin != i) {
                list[minIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}


