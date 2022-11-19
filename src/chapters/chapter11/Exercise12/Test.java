package chapters.chapter11.Exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers : ");

        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        double sum = sum(list);
        System.out.println(sum);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
