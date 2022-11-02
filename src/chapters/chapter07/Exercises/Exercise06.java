package chapters.chapter07.Exercises;


public class Exercise06 {
    public static void main(String[] args) {

        int primes = 0;
        int NUM_PRIMES = 50;
        int[] primeNumbers = new int[50];
        int number = 2;
        int index = 0;
        while (primes < NUM_PRIMES) {
            if (isPrime(number)) {
                primeNumbers[index] = number;
                primes++;
                index++;
            }
            number++;
        }
        displayPrimes(primeNumbers);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void displayPrimes(int[] primeNumbers) {
        int line = 1;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (line % 10 == 0) {
                System.out.println(primeNumbers[i]);
            } else System.out.printf("%-5d", primeNumbers[i]);
            line++;
        }
    }
}
