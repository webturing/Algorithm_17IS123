package lec14dp2;

import java.util.Arrays;

public class MatrixChains3 {
    static int dp[][] = new int[100][100];

    static {
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], Integer.MAX_VALUE);
    }

    private static int f(int[] p, int i, int j) {
        if (dp[i][j] != Integer.MAX_VALUE)
            return dp[i][j];
        if (i == j) return dp[i][j] = 0;
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            //从k处断开 第一部分是计算i,k这段，第二部分是计算k+1,j这段
            ans = Math.min(f(p, i, k) + f(p, k + 1, j) + p[i - 1] * p[k] * p[j], ans);
        }
        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] M = new int[]
                {30, 35, 15, 5, 10, 20, 25};


        System.out.println(f(M, 1, 6));
    }


}

