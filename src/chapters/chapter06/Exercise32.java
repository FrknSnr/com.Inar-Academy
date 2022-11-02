package chapters.chapter06;

public class Exercise32 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int total;
        int wins = 0;
        int loses = 0;
        for (int i = 1; i <= 10000; i++) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            total = dice1 + dice2;
            if (isCraps(dice1, dice2)) {
                loses++;
            } else if (isNatural(dice1, dice2)) {
                wins++;
            } else {
                if (isContinue(total)) {
                    wins++;
                } else {
                    loses++;
                }
            }
        }
        System.out.println(wins);
        System.out.println(loses);
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
                return true;
            } else if (d1 + d2 == 7) {
                return false;
            }
        }

    }

}