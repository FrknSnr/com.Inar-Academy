package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {

        String[] zodiac = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = input.nextInt();
        System.out.println(zodiac[year % 12]);

    }
}
