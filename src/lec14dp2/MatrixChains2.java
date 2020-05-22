package lec14dp2;

public class MatrixChains2 {
    public static void main(String[] args) {
        int n = 6;
        int[] M = new int[]
                {30, 35, 15, 5, 10, 20, 25};

        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    dp[i][j] = 0;
                else
                    dp[i][j] = Integer.MAX_VALUE;
            }

        for (int i = 2; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = i; k <= j - 1; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + M[i - 1] * M[k] * M[j]);
                }
            }
        }
        System.out.println(dp[1][n]);
    }
}

