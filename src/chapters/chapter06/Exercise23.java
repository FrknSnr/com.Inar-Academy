package chapters.chapter06;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = input.nextLine();
        System.out.println("Enter a character :");
        char ch = input.next().charAt(0);
        System.out.println("The number of occurrences of the character " + ch + " in the string is : " + count(s, ch));
    }
    public static int count(String str, char a) {
        int count = 0;
        for(int i = 0; i < str.length() ; i++){
            if(a == str.charAt(i)){
                count++;
            }
        }
        return count ;
    }
}
