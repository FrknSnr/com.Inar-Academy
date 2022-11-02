package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise41 {

    public static void main(String[] args) {

        int largest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers. Program ends with 0 .");
        int numbers = input.nextInt();
        int count = 1;

        while (numbers != 0) {

            numbers = input.nextInt();
            if (numbers > largest) {
                largest = numbers;
            }
            else if(numbers == largest){
                count++;
            }


        }
        System.out.println("The largest number is : " + largest + " " + count + " times.");


    }
}
