package LastPart.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_15 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        boolean wrongAnswer = true;
        Set<Integer> list = new HashSet<>();
        do {
            if (checkAnswer(num1, num2, list)) {
                System.out.println("You got it ! ");
                wrongAnswer = false;
            } else {
                System.out.print("Wrong answer. Try again. ");
            }
        } while (wrongAnswer);
    }

    public static boolean checkAnswer(int n1, int n2, Set<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + n1 + " + " + n2 + " ? ");
        int answer = input.nextInt();
        if (list.contains(answer)) {
            System.out.println("You already entered " + answer);
            return false;
        }
        if (n1 + n2 != answer) {
            list.add(answer);
            return false;
        }
        return true;
    }
}
