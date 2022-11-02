package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = input.nextLine();
        String odd = "";

        for(int i = 0 ; i < s.length(); i += 2){
            odd += s.charAt(i);

        }
        System.out.println(odd);



}
}