package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {

        int[] arr = createArr();
        combinations(arr);

    }

    public static int[] createArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers :");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void combinations(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length  ; j++){
                if (i != j){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
