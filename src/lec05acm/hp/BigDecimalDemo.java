package lec05acm.hp;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //1.01^365

        //1.02^365
        System.out.println(Math.pow(1.01, 365));
        System.out.println(Math.pow(1.02, 365));
        System.out.println(Math.pow(0.99, 365));
        System.out.println(Math.pow(0.98, 365));

        System.out.println(new BigDecimal("1.01").pow(365));//1.01^365
    }
}
