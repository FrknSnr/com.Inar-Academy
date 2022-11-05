package chapters.chapter09.Exercise11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e and f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation le = new LinearEquation(a, b, c, d, e, f);
        if (!le.isSolvable()){
            System.out.println("The equation has no solution.");
        }else System.out.println("X is : "+ le.getX() + "\nY is : " + le.getY());
    }
}
