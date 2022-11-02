package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise51 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String s1 = input.nextLine();
        System.out.println("Enter the second string :");
        String s2 = input.nextLine();
        String largestPrefix = "" ;
        int k = 0;

        while(s1.charAt(k)==s2.charAt(k)){
            largestPrefix+= s1.charAt(k);
            k++;
    }
        if(largestPrefix.length() > 0){
            System.out.println("The largest prefix is : " + largestPrefix);
        }
        else{
            System.out.println("There is no common prefix.");
        }


    }
}

