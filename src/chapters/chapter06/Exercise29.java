package chapters.chapter06;

public class Exercise29 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 1000) {
            if (isPrime(number)) {
                int numberPlusTwo = number + 2 ;
                if (isPrimePlusTwo(numberPlusTwo)) {
                    System.out.println("( " + number + "," + numberPlusTwo + ")");
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
    }  public static boolean isPrimePlusTwo(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
