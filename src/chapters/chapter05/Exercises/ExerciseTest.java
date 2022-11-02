package chapters.chapter05.Exercises;


import java.util.Scanner;

public class ExerciseTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers / ends with 0 :");
        int i = input.nextInt();
        int largest = 0 ;
        int numberOfLargest = 1 ;

        while(i != 0) {
            i = input.nextInt();
            if (largest < i) {
               largest = i ;
            }
            else if (i == largest) {
                numberOfLargest++;
            }
        }
        System.out.println("The largest number is : " + largest +"\nThe occurrence count of the largest number is : " + numberOfLargest );


        }
       }


