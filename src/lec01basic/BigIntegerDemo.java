package lec01basic;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < 10; i++) {
            BigInteger f = two.pow(1 << i).add(BigInteger.ONE);
            System.out.println(f);
            System.out.println(f.isProbablePrime(100));

        }
    }
}
