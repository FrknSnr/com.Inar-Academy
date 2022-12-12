package LastPart.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise07_06 {
    public static void main(String[] args) {

        Set<Integer> primes = new HashSet<>();
        final int MAX = 50;
        int num = 2;
        int count = 0;
        while (count < MAX) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }
        display(primes);
    }public static void display(Set<Integer> primes){
        System.out.println(Arrays.toString(primes.toArray()));
    }

    public static boolean isPrime(int num) {
        for (int dividor = 2; dividor <= Math.sqrt(num); dividor++) {
            if (isAlsoPrime(dividor)) {
                if (num % dividor == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAlsoPrime(int dividor) {
        for (int i = 2; i <= dividor / 2; i++) {
            if (dividor % i == 0) {
                return false;
            }
        }
        return true;
    }
}
