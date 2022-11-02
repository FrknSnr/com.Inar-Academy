package chapters.chapter06;

public class Exercise10 {
    public static void main(String[] args) {
        int count = 0;
        int NUM_PER_LİNE = 10 ;
        for (int number = 2; number < 10000; number++) {
            if (isPrime(number)) {
                count++;
                if (count % NUM_PER_LİNE == 0) {
                    System.out.println(number);
                } else System.out.printf("%-6d", number);

            }
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
}
