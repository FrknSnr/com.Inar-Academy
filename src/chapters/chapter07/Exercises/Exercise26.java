package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) {

        int[] list1 = getList1();
        int[] list2 = getList2();
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else System.out.println("Two lists are not strictly identical");
    }

    public static int[] getList1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list 1 :");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length ; i++) {
            list1[i] = input.nextInt();
        }
        return list1;
    }

    public static int[] getList2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list 2 :");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length ; i++) {
            list2[i] = input.nextInt();
        }
        return list2;
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        else
            for (int i = 0; i < list2.length; i++) {
                if (list1[i] != list2[i])
                    return false;
            }
        return true;
    }
}



