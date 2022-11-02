package chapters.chapter06;

public class Exercise26 {
    public static void main(String[] args) {
        int NUM_PER_LINE = 10;
        int count = 0;
        int max = 100;
        int number = 2;
        while (count <= max) {
            if (isPrime(number)) {
                if (isPalindrome(number)) {
                    count++;
                    if (count % NUM_PER_LINE == 0) {
                        System.out.println(number);
                    } else System.out.print(number + " ");
                }
            } number++;
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

    public static boolean isPalindrome(int number) {
        String s = "" + number;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
