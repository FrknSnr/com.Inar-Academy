package chapters.chapter06;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int n){
       String reverse = "";
       while ( n != 0) {
           reverse += n % 10 ;
           n /= 10 ;

       }
        System.out.println("Its reversal is : " + reverse);
    }
}
