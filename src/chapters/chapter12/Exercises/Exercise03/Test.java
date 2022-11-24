package chapters.chapter12.Exercises.Exercise03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] arr = createArr();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index : ");
        try {
            System.out.println(arr[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] createArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
