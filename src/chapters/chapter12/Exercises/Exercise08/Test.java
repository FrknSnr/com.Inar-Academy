package chapters.chapter12.Exercises.Exercise08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number : ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hex2Dec(hex.toLowerCase()));
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hex2Dec(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'))
                throw new HexFormatException("String is not a hex string !");
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else return ch - '0';
    }
}

class HexFormatException extends Throwable {
    public HexFormatException(String message) {
        super(message);
    }
}


