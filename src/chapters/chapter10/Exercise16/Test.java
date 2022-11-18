package chapters.chapter10.Exercise16;

import javax.jws.soap.SOAPBinding;
import java.math.BigInteger;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int count = 0;
        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        while (count < 10) {
            if (num.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || num.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(num);
                count++;
            }
            num = num.add(new BigInteger("1"));
        }
    }
}
