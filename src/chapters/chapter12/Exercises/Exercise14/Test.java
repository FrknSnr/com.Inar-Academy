package chapters.chapter12.Exercises.Exercise14;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file's path name : ");
        String s = input.nextLine();
        File file = new File(s);
        if (!file.exists()){
            System.out.println("There isn't any file!");
            System.exit(1);
        }
        double total = 0;
        int countOfNums = 0;
        double average ;
        try(
                Scanner input1 = new Scanner(file)
                ){
            while(input1.hasNext()){
                total += input1.nextDouble();
                countOfNums++;
            }
        }
        average = total / countOfNums ;
        System.out.println("Sum of the numbers is : " + total + "\nAverage of the numbers is " + average);
    }
}
