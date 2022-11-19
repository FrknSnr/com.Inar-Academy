package chapters.chapter11.Exercise11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five number");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        sort(list);

    }public static void sort(ArrayList<Integer> list){
        java.util.Collections.sort(list);
        System.out.println(list);

    }
}
