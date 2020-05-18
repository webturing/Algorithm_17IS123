package lec13dp;

public class Fib3 {

    static int[] dp = new int[50 + 1];//数组下标从0开始

    static {
        //  Arrays.fill(dp, -1);
    }

    static int fib(int n) {//O(a^n)=>O(n)
        if (dp[n] != 0) return dp[n];//查表
        if (n == 1 || n == 2) return dp[n] = 1;//存储计算结果
        else return dp[n] = fib(n - 1) + fib(n - 2);//存储计算结果

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(fib(46));//答案
        long end = System.currentTimeMillis();

        System.out.println(String.format("%.3f", (end - start) / 1000.0));
    }


}
