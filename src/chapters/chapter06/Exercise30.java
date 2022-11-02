package chapters.chapter06;

public class Exercise30 {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int total = dice2 + dice1;
        if (isCraps(dice1, dice2)) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + total);
            System.out.println("You lose!");
        } else if (isNatural(dice1, dice2)) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + total);
            System.out.println("You win!");
        } else {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
            System.out.println("Point is : " + total);
            if (isContinue(total)) {
                System.out.println("You win !");
            } else System.out.println("You lose .");
        }
    }

    public static boolean isCraps(int num1, int num2) {
        return (num1 + num2 == 2 || num1 + num2 == 3 || num1 + num2 == 12);
    }

    public static boolean isNatural(int n1, int n2) {
        return (n1 + n2 == 7 || n1 + n2 == 11);
    }

    public static boolean isContinue(int total) {
        int d1, d2;
        while (true) {
            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;
            if (d1 + d2 == total) {
                System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1 + d2));
                return true;
            } else if (d1 + d2 == 7) {
                System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1 + d2));
                return false;
            }
        }

    }

}