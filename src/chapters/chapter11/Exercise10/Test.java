package chapters.chapter11.Exercise10;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        MyStack s = getInput(input);
        int size = s.getSize();

        for (int i = 0; i < size; i++) {
            System.out.println(s.pop());
        }
    }

    public static MyStack getInput(Scanner input) {
        System.out.println("Enter five strings");
        MyStack s = new MyStack();
        for (int i = 0; i < 5; i++) {
            s.push(input.nextLine());
        }
        return s;
    }
}
