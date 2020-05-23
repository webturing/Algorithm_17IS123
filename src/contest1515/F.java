package contest1515;

import java.util.Arrays;
import java.util.Scanner;

public class F {
    static int dp[][] = new int[100][100];

    static {
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], Integer.MAX_VALUE);
    }

    private static int f(int[] p, int i, int j) {//O(n^3)
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
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] M = new int[n + 1];
        M[0] = cin.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            M[i] = cin.nextInt();
            cin.nextInt();


        }
        M[n] = cin.nextInt();
        System.err.println(Arrays.toString(M));


        System.out.println(f(M, 1, 6));
    }


}

