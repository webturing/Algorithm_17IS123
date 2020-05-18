package lec13dp;

import java.util.Arrays;

public class DeductionDemo {
    static int f(int n) {//归纳法
        System.err.println("call f(" + n + ")");
        if (n == 0) return 1;
        return f(n - 1) * n;
    }

    public static void main(String[] args) {
        // System.out.println(f(5));
        int[] dp = new int[10];//递推 从小到大，逐步推到
        dp[0] = 1;//起点
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] * i;//递推式
        }
        System.out.println(Arrays.toString(dp));

    }
}
