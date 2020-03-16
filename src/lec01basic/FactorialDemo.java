package lec01basic;

import java.math.BigInteger;

public class FactorialDemo {
    //n!= ....p^x....

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "!=" + factorial(i));
        }
    }

    private static BigInteger factorial(int n) {
        BigInteger s = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            s = s.multiply(new BigInteger(String.valueOf(i)));
        }
        return s;
    }
}
