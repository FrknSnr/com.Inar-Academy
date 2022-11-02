package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = input.nextLine().toUpperCase();
        int vowels = 0;
        int consonants = 0;
        int i = s.length();
        int j = 0;

        while (j < i) {
            if(s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' ||s.charAt(j) == 'O' ||s.charAt(j) == 'U') {
                vowels ++;
            }else if (s.charAt(j) != ' ') {
                consonants++;
            }j++;
        }
        System.out.println("The number of vowels is : " + vowels + " and the number of consonants is : " + consonants);


    }
}
