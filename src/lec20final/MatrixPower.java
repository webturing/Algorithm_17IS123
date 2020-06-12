package lec20final;

public class MatrixPower {
    static int MOD = 10000;

    static int[][] mul(int[][] a, int b[][]) {
        //n*p p*m => n*m
        //c[i][j]=a[i][0]*b[0][j]+...a[i][n-1]b[n-1][j];
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }

        return c;

    }

    static int[][] pow(int[][] a, int n) {//logN
        if (n == 0) {
            int[][] res = new int[a.length][a.length];
            for (int i = 0; i < a.length; i++) res[i][i] = 1;
            return res;
        }
        if (n == 1) return a.clone();
        int[][] t = pow(a, n / 2);
        if (n % 2 == 0) {
            return mul(t, t);

        } else {
            return mul(mul(t, t), a);
        }
    }


    public static void main(String[] args) {
        int[][] a = new int[][]{{0, 1}, {1, 1}};
        int[][] b = new int[][]{{0, 1}, {1, 1}};

        System.out.println(pow(a, 2000000000)[1][1]);

    }

    private static void disp(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
