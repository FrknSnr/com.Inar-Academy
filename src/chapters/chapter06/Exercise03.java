package chapters.chapter06;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else System.out.println(number + " is not a palindrome");
    }
    public static boolean isPalindrome(int n) {
        return (n == reverse(n)) ;
    }
    public static int reverse(int i) {
        String reverse = "";
        while(i != 0){
            reverse += i % 10 ;
            i = i / 10 ;
        }return Integer.parseInt(reverse) ;
    }
}
