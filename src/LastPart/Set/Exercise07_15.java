package LastPart.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_15 {

    public static void main(String[] args) {

        int[] list = getFromUser();
        Set<Integer> eliminatedList = eliminateDuplicates(list);
        System.out.println(Arrays.toString(eliminatedList.toArray()));

    }

    public static Set<Integer> eliminateDuplicates(int[] list) {
        Set<Integer> eliminatedList = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            eliminatedList.add(list[i]);
        }
        return eliminatedList;
    }


    public static int[] getFromUser() {
        int[] list = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers : ");
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}
