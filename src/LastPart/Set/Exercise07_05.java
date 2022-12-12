package LastPart.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_05 {

    public static void main(String[] args) {

        Set<Integer> numbers = createSet();
        display(numbers);

    }

    public static void display(Set<Integer> numbers) {
        System.out.println("The number of distinct number is : " + numbers.size());
        System.out.print("The distinct numbers are : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static Set<Integer> createSet() {
        Set<Integer> arr = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers : ");
        for (int i = 0; i < 10; i++) {
            arr.add(input.nextInt());
        }
        return arr;
    }
}
