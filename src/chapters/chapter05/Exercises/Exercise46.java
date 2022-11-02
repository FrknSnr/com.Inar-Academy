package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise46 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = input.nextLine();
        int i =s.length();
        String reverse = "";
        int j = 0;

        while(j < i ){
            reverse = s.charAt(j) + reverse ;
            j++;
        }
        System.out.println("The reverse of the string is : " + reverse);






    }
}
