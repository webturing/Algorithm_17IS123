package lec05acm.hp;


import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1111111111111111");
        BigInteger b = new BigInteger("22222222222222222");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        System.out.println(a.pow(2));
        System.out.println(a.isProbablePrime(10));
    }
}
