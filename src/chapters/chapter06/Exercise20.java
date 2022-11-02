package chapters.chapter06;

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = input.nextLine().toUpperCase();
        System.out.println("The number of the letters is : " + countLetters(s));
    }
    public static int countLetters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            if ((int) j >= 65 && (int) j <= 90) {
                count++;
            }
        }
        return count;
    }
}
