package lec13dp;

import java.util.Arrays;

public class MemorizeSearch {
    static int[] dp = new int[10];//记忆数组

    static int f(int n) {//归纳法
        if(dp[n]!=0){//先查表避免重复计算
            return dp[n];
        }
        if (n == 0)
            return dp[n] = 1;//及时把计算结果存入数组
        else
            return dp[n] = f(n - 1) * n;//及时把计算结果存入数组
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dp));

        System.out.println(f(3));
        System.out.println(Arrays.toString(dp));
        System.out.println(f(5));

    }
}
