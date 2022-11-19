package chapters.chapter11.Exercise13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers : ");
        Integer[] values = fillTheArr(input);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(values));
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distincts = new ArrayList<>();
        while (!list.isEmpty()) {
            if (!distincts.contains(list.get(list.size() - 1))) {
                distincts.add(list.remove(list.size() - 1));
                list.remove(list.size()-1);
            }
        }
        for (int i = 0; i < distincts.size(); i++) {
            System.out.print(distincts.get(i) + " ");
        }
    }

    public static Integer[] fillTheArr(Scanner input) {
        Integer[] values = new Integer[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }
}
