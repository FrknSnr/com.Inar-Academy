package chapters.chapter11.Exercise04;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending with 0 :");
        ArrayList<Integer> list = new ArrayList<>();

        int num;
        do {
            num = input.nextInt();
            if (num != 0) {
                list.add(num);
            }
        } while (num != 0);
        int max = max(list);
        System.out.println(max);
    }

    public static Integer max(ArrayList<Integer> list) {
        return (java.util.Collections.max(list));
    }
}
