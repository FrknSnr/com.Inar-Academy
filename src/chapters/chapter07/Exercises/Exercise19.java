package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        System.out.println("Enter list : ");
        int[] list = createList();
        if (isSorted(list)){
            System.out.println("The list is already sorted.");
        }else System.out.println("The list is not sorted.");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 1 ; i < list.length ; i++){
            if (list[i - 1] > list[i]){
                return false ;
            }
        }return true ;
    }

    public static int[] createList() {
        Scanner input = new Scanner(System.in);
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }return list;
    }


}
