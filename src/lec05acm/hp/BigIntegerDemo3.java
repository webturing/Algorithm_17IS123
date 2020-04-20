package lec05acm.hp;


import java.math.BigInteger;

public class BigIntegerDemo3 {
    //a^n mod p    gcd(a,p)=1
    public static void main(String[] args) {
        BigInteger a = new BigInteger("31");
        BigInteger p = new BigInteger("17");
        for (int i = 1; i <= 17; i++) {
            BigInteger ai = a.pow(i);
            System.out.println(a + "^" + i + " %" + p + "=" + ai.mod(p));

        }
    }
}
