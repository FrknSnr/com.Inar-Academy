package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer");
        String s = input.nextLine();
        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length ; i++ ){
            sum += (Integer.parseInt(s.substring(i,i+1))) * (i + 1) ;
        }if(sum % 11 == 10 ){
            s += 'X';
            System.out.println(s);
        }
        else
            System.out.println(s + (sum % 11));

    }
}
