package chapters.chapter10.Exercise06;

import chapters.chapter10.Exercise05.StackOfIntegers;

public class Test {

    public static void main(String[] args) {

        StackOfIntegers prime = findThePrimes(120);
        displayReversed(prime);


    }

    public static void displayReversed(StackOfIntegers prime) {
        while (!prime.empty()) {
            System.out.println(prime.pop());
        }
    }


    public static StackOfIntegers findThePrimes(int n) {
        StackOfIntegers primes = new StackOfIntegers();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.push(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
