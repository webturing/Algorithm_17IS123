package lec13dp;

public class Fib2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int n = 46;
        int[] dp = new int[n + 1];//数组下标从0开始
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);//答案
        long end = System.currentTimeMillis();

        System.out.println(String.format("%.3f", (end - start) / 1000.0));
    }


}
