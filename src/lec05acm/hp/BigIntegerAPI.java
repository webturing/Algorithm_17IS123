package lec05acm.hp;

import java.math.BigInteger;

public class BigIntegerAPI {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //  System.out.println(Math.pow(2,i));
            System.out.println(new BigInteger("2").pow(i));
        }

    }
}
