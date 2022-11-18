package chapters.chapter10.Exercise21;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {

        long n = Long.MAX_VALUE;
        BigInteger num = new BigInteger(n + "");
        int count = 0;
        while (count < 10) {
            num.add(new BigInteger("1"));
            if (num.remainder(new BigInteger("5")).equals(new BigInteger("0")) || num.remainder(new BigInteger("6")).equals(new BigInteger("0"))) {
                System.out.println(num);
                count++;
            }
        }
    }
}
