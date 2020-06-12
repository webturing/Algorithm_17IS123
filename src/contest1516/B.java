package contest1516;

import java.util.Scanner;

public class B {
    static int n = 10;
    static int[] a = new int[n];

    static {
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = i * a[i - 1];
        }
    }

    static boolean dfs(int k, int t) {
        if (k >= n) return t == 0;
        if (t == 0) return true;
        return dfs(k + 1, t - a[k]) || dfs(k + 1, t);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int cas = cin.nextInt(); cas-- > 0; ) {
            int n = cin.nextInt();
            System.out.println(dfs(0, n) ? "Yes" : "No");
        }
    }
}