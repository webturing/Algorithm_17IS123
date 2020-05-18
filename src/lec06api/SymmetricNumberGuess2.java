package lec06api;

import java.math.BigInteger;

public class SymmetricNumberGuess2 {
    public static void main(String[] args) {
        // unitTest();
        BigInteger n = new BigInteger("196");
        int tot = 0;
        while (true) {
            ++tot;
            //if (tot == 50) break;
            BigInteger m = r(n);
            if (m.equals(n)) break;
            //n=n+m
            System.out.println(String.format("[%d:]%s+%s=%s", tot, n, m, n = n.add(m)));
        }
    }


    //计算一个整数的翻转数
    private static BigInteger r(BigInteger n) {
        StringBuilder s = new StringBuilder(n.toString());
        s.reverse();
        return new BigInteger(s.toString());
    }


}
