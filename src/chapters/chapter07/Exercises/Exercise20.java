package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        double[] arr = createArray();
        selectionSort(arr);

    }

    public static double[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers :");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        return arr;

    }

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1 ; i >= 0 ; i--) {
            double temp = 0 ;
            for (int j =  i - 1 ; j >= 0  ; j--){
                if (list[i] < list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
