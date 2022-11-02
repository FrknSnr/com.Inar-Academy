package chapters.chapter06;

import java.util.Scanner;

public class Exercise37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        System.out.println("Enter its width :");
        int width = input.nextInt();
        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String s = ""+ number;
        for(int i = s.length() ; i < width ; i++){
            s = 0 + s ;

        }return s ;

    }

}
