package chapters.chapter06;

public class Exercise27 {
    public static void main(String[] args) {
        int NUM_PER_LINE = 10;
        int number = 2;
        int count = 0;
        int max = 100;
        while (count <= max) {
                if (isPrime(number)) {
                    if (isReversalPrime(number)) {
                        count++;
                        if (count % NUM_PER_LINE == 0) {
                            System.out.println(number);
                        } else System.out.printf(number + " ");
                    }
                }
                number++;
            }
        }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isReversalPrime(int number) {
        String s = "" + number;
        String reversal = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversal += s.charAt(i);
        }
        int i = Integer.parseInt(reversal);
        if (i == number) {
            return false ;
        }
        else return isPrime(i);
}
}