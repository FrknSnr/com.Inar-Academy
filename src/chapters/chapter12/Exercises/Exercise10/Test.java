package chapters.chapter12.Exercises.Exercise10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = new int[(int) (Math.pow(10, 10))];
        }catch (OutOfMemoryError ex){
            System.out.println("It is too much !");
        }
    }
}
