package lec15dfs;

import java.util.Arrays;

//深度优先搜索遍历子集空间
public class SubSetDfs {
    static int n = 4;
    static int[] a = new int[]{1, 2, 3, 4};
    static int[] vis = new int[n];

    static void dfs(int k) {
        if (k >= n) {//已经访问完毕叶子节点
            System.out.print(Arrays.toString(vis));
            for (int i = 0; i < n; i++) {
                if (vis[i] == 1) {
                    System.out.print(a[i] + " ");
                }

            }
            System.out.println();
            return;//!!!递归结束
        }
        vis[k] = 0;//放弃第k个砝码
        dfs(k + 1);
        vis[k] = 1;//选择第k格砝码
        dfs(k + 1);
    }

    public static void main(String[] args) {
        dfs(0);
    }

}
