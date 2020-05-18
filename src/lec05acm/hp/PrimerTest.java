package lec05acm.hp;

import java.math.BigInteger;

public class PrimerTest {
    public static void main(String[] args) {
        int c = 10;//1023/1024 99.9%
        System.out.println(new BigInteger("65537").isProbablePrime(c));
        System.out.println(new BigInteger("2").pow(1 << 5).add(BigInteger.ONE));//f(5)=40亿+
        System.out.println(new BigInteger("2").pow(1 << 5).add(BigInteger.ONE).isProbablePrime(c));//f(5)=40亿+
    }
}
