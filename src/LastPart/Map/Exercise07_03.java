package LastPart.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {

        Map<Integer, Integer> list = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100 (Ends with '0') :  ");
        int value;

        do {
            value = input.nextInt();
            if (list.containsKey(value)) {
                int num = list.get(value);
                list.put(value, num + 1);
            } else {
                list.put(value, 1);
            }
        } while (value != 0);

        display(list);

    }

    public static void display(Map<Integer, Integer> list) {
        for (int e : list.keySet()) {
            if ( e != 0 ) {
                System.out.println(e + " occurs " + list.get(e) + " time" + (list.get(e) > 1 ? "s" : ""));
            }
        }
    }
}
