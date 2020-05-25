package lec15dfs;

import java.util.Arrays;

public class App2b {
    static int N = 10;
    static int[] a = new int[N + 1];
    static int[] vis = new int[N + 1];

    static void dfs(int k) {
        if (k == N) {//到达叶子节点
            int x = a[1] * 100 + a[2] * 10 + a[3];
            int y = a[4] * 100 + a[5] * 10 + a[6];
            int z = a[7] * 100 + a[8] * 10 + a[9];
            if (y == 2 * x && z == 3 * x) {
                System.out.println(Arrays.toString(a));
            }
            return;//!!!!!!
        }
        for (int i = 1; i <= N; i++) {
            if (vis[i] == 1) continue;
            vis[i] = 1;
            a[k] = i;
            dfs(k + 1);
            vis[i] = 0;

        }
    }

    public static void main(String[] args) {
        dfs(1);
    }
}
