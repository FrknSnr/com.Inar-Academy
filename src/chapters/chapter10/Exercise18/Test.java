package chapters.chapter10.Exercise18;

import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {
        long n = Long.MAX_VALUE;
        BigInteger num = new BigInteger(n + "");
        for (int i = 0; i < 5; i++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            num = num.add(new BigInteger("1"));
        }
    }

    public static boolean isPrime(BigInteger n) {
        BigInteger divisor = new BigInteger("2");
        BigInteger maxDivisor = n.divide(new BigInteger("2"));
        while (divisor.compareTo(maxDivisor) != 1) {
            if (n.remainder(divisor).equals(new BigInteger("0"))) {
                return false;
            }
            divisor = divisor.add(new BigInteger("1"));
        }
        return true;
    }
}
