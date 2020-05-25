package lec15dfs;


import java.util.Arrays;

//深度优先搜索遍历全排列空间
public class PermDfs {
    static int n = 4;
    static int[] a = new int[n];
    static int[] vis = new int[n];

    static void dfs(int k) {
        if (k == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                a[k] = i + 1;
                vis[i] = 1;
                dfs(k + 1);
                vis[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
