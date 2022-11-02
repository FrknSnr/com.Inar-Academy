package chapters.chapter06;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password");
        System.out.println("■ A password must have at least eight characters.\n" +
                "■ A password consists of only letters and digits.\n" +
                "■ A password must contain at least two digits.");
        String password = input.nextLine().toUpperCase();
        if (isEight(password)) {
            if (isLetterOrDigit(password)) {
                if (isContainsTwoDigits(password)) {
                    System.out.println("The password is valid.");
                }
            }
        } else
            System.out.println("It is invalid.");
    }

    public static boolean isEight(String password) {
        int required = 8;
        return (password.length() >= required);
    }

    public static boolean isLetterOrDigit(String password) {
        for (int i = 0; i <= password.length() - 1; i++) {
            char k = password.charAt(i);
            if ((int) k >= 48 && (int) k <= 57)
                return true;
            else if ((int) k >= 65 && (int) k <= 90)
                return true;
        }
        return false;
    }

    public static boolean isContainsTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char k = password.charAt(i);
            if ((int) k >= 48 && (int) k <= 57) {
                count++;
            }
        }
        return (count >= 2);
    }
}
