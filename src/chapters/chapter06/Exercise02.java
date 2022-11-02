package chapters.chapter06;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        System.out.println(sumDigits(number));

    }public static int sumDigits(int n){
       int sum = 0;
        while(n != 0){
           sum += n % 10 ;
           n /= 10 ;
       }
        return sum ;
    }
}
