package lec06api;

import java.math.BigInteger;
//a^n % MOD
//3^1997 %10
public class PowerDemo {
    static int MOD = 10;

    static int linearPower(int a, int n) {//O(n)=O(n-1)
        int res = a;
        for (int i = 1; i < n; i++) {
            res = (res * a) % MOD;
        }
        return res;
    }

    static int quickPower(int a, int n) {//O(logN)
        if (n == 0 || a == 1) return 1;
        if (n == 1) return a % MOD;
        int t = quickPower(a, n / 2);
        if (n % 2 == 0) {
            return t * t % MOD;
        } else {
            return t * t * a % MOD;
        }
    }

    public static void main(String[] args) {
        int a = 3, n = 209900007;
        //System.out.println(Math.pow(a, n));//10^308
        //System.out.println(new BigInteger(Integer.toString(a)).pow(n));//ok
        long start=System.currentTimeMillis();
        //System.out.println(linearPower(a, n));//10s
        System.out.println(quickPower(a, n));//1~3 ms
        System.out.println(System.currentTimeMillis()-start);
    }
}
