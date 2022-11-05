package chapters.chapter09.Exercise10;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Enter values for a, b and c.");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation n = new QuadraticEquation(a,b,c);

        if (n.getDiscriminant() > 0) {
            System.out.println("Root 1 is : " + n.getRoot1());
            System.out.println("Root 2 is : " + n.getRoot2());
        }else if (n.getDiscriminant() == 0){
            System.out.println("Root is : " + n.getRoot2());
        }else System.out.println("The equation has no real roots. " );
    }


}
