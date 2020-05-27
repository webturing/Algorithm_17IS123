package lec14dp2;

public class MatrixChains2 {
    public static void main(String[] args) {
        int n = 6;
        int[] p = new int[]
                {30, 35, 15, 5, 10, 20, 25};

        int[][] m = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    m[i][j] = 0;
                else
                    m[i][j] = Integer.MAX_VALUE;
            }
        for (int r = 2; r <= n; r++) {
            for (int i = 1; i <= n - r + 1; i++) {
                int j = i + r - 1;
                m[i][j] = m[i + 1][j] + p[i - 1] * p[i] * p[j];
                for (int k = i + 1; k < j; k++) {
                    m[i][j] = Math.min(m[i][j], m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]);
                }
            }
        }

        System.out.println(m[1][n]);
    }
}

