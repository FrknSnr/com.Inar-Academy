package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        int i = s.length();
        int upperCase = 0;

        for (int j = 0; j < i; j++) {
            int k = s.charAt(j);
            if (k < 97) {
                upperCase++;
            }


        }
        System.out.println("The number of uppercase letters is :" + upperCase);

    }
}
