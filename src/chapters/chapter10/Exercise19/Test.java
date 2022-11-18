package chapters.chapter10.Exercise19;

import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {

        System.out.println("p         2^p-1");
        BigInteger number = new BigInteger("2");
        while (number.compareTo(new BigInteger("100")) != 1) {
            if (isPrime(number)) {
                if (isMersenne(number.multiply(new BigInteger("2")).subtract(new BigInteger("1")))) {
                    System.out.printf("%d%10d\n", number, (number.multiply(new BigInteger("2")).subtract(new BigInteger("1"))));
                    number = number.add(new BigInteger("1"));
                }
            }
        }
    }

    public static boolean isMersenne(BigInteger n) {
        return (isPrime(n));
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
