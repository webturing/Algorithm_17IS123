package lec13dp;

public class DigitTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[][] { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 },

        };
        int[][] dp = new int[5][5];
        for (int j = 0; j < n; j++)
            dp[n - 1][j] = a[n - 1][j];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = a[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }

        }

        System.out.println(dp[0][0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.print(dp[i][j] + " ");
            }
            System.err.println();
        }

    }
}
