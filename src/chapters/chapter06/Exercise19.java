package chapters.chapter06;
import java.util.Scanner;

public class Exercise19 {
    // s = (side1 + side2 + side3)/2;
    // area =Math.pow (s(s - side1)(s - side2)(s - side3) , 0.5 )
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the the first side :");
        double side1 = input.nextInt();
        System.out.println("Enter the the second side :");
        double side2 = input.nextInt();
        System.out.println("Enter the the third side :");
        double side3 = input.nextInt();
        if (isValid(side1, side2, side3)) {
            System.out.println(area(side1, side2, side3));
        }else System.out.println("The input is invalid. ");
    }
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2);
        }
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return (int)(Math.pow(s * (s - side1) * (s - side2) * (s - side3), 1.0 / 2) * 100 ) / 100.0 ;
    }
}
