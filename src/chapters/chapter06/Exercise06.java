package chapters.chapter06;

import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n){
        for(int i = 1 ; i <= n ; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = i ; k >= 1 ; k--){
                System.out.printf("%-3d" ,k );
            }
            System.out.println();
        }
    }

}
