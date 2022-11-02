package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise47 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string");
        String s = input.nextLine();
        int i = s.length();
        int total = 0;
        if(i != 12){
            System.err.println("You entered invalid input");
            System.exit(1);
        }
        for (int j = 0; j < i; j++) {
            if (j % 2 == 0) {
                total +=  Integer.parseInt(s.substring(j, j+1));
            } else {
                total += 3 * Integer.parseInt(s.substring(j, j+1));
            }
        }
        int checksum = 10 - total % 10;
        if (checksum == 10) {
            checksum = 0;
        }
        int ISBN = Integer.parseInt(s) + checksum ;
        System.out.println("The ISBN-13 number is " + ISBN);
    }


}
