package contest1515;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int T = cin.nextInt(); T-- > 0; ) {
            int n = cin.nextInt();
            int[][] a = new int[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    a[i][j] = cin.nextInt();

                }
            }
            //   print2D(a);
            int[][] dp = new int[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                dp[n - 1][i] = a[n - 1][i];
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    dp[i][j] = a[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);

                }
                //    System.err.println("----------------");
                //   print2D(dp);

            }
            System.out.println(dp[0][0]);

        }
    }

    private static void print2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.err.print(a[i][j] + " ");
            }
            System.err.println();
        }
    }
}
