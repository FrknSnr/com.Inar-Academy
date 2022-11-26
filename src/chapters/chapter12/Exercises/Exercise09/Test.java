package chapters.chapter12.Exercises.Exercise09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number : ");

        String binaryString = input.nextLine();

        try {
            System.out.println(bin2Dec(binaryString));
        } catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String s) throws BinaryFormatException {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Oops ! A binary number contains only '1' or '0' .");
            }

        }
        int decimal = 0;
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            if (s.charAt(i) == '1') {
                decimal += Math.pow(2, j);
            }
        }
        return decimal;
    }
}

class BinaryFormatException extends Throwable {
    public BinaryFormatException(String message) {
        super(message);
    }
}
