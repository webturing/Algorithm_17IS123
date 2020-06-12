package contest1516;

import java.util.Scanner;

public class D {
    static int n;//问题规模
    static int[] a;//存储全排列的结果
    static boolean[] v;//标记数组

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[n + 1];//下标从1开始
        v = new boolean[n + 1];//
        dfs(1);
    }

    // static boolean flag;//全局搜索，只搜到一个解
    private static void dfs(int k) {
        if (k > n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;//!!!!
        }
        for (int i = 1; i <= n; i++) {
            if (v[i]) continue;
            v[i] = true;
            a[k] = i;//把i这个没有用过的数放在数组的第k个位置
            dfs(k + 1);//进行k+1搜索
            v[i] = false;//k+1层搜索结束，重置v[i]为false 以便下一轮可以用
        }
    }
}