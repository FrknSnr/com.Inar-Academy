package chapters.chapter10.Exercise17;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {

        long n = (long) Math.sqrt(Long.MAX_VALUE);
        BigInteger number = new BigInteger(n + "");
        for (int i = 0; i < 10; i++) {

            number = number.add(BigInteger.ONE);
            System.out.println(number.multiply(number));

        }
    }
}
