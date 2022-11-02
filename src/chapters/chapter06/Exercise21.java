package chapters.chapter06;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phone number :");
        String s = input.nextLine().toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char j = s.charAt(i);
            System.out.print((char)getNumber(j));
        }
    }
    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter < 65) {
            return uppercaseLetter;
        } else if (uppercaseLetter <= 67) {
            return '2';
        } else if (uppercaseLetter <= 70) {
            return '3';
        } else if (uppercaseLetter <= 73) {
            return '4';
        } else if (uppercaseLetter <= 76) {
            return '5';
        } else if (uppercaseLetter <= 79) {
            return '6';
        } else if (uppercaseLetter <= 83) {
            return '7';
        } else if (uppercaseLetter <= 86) {
            return '8';
        } else if (uppercaseLetter <= 90) {
            return '9';
        } else
            return uppercaseLetter;
    }
}
