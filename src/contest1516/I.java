package contest1516;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[n];//下标从1开始
        v = new boolean[n];//
        if (n % 2 == 0)
            dfs(0);
        if (!flag) {
            System.out.println("no solution");
        }
    }

    static int n;//问题规模
    static int[] a;//存储全排列的结果
    static boolean[] v;//标记数组
    static boolean flag;//全局搜索，只搜到一个解

    private static void dfs(int k) {
        if (flag) return;
        if (k >= n) {
            if (primer(a[n - 1] + a[0])) {
                flag = true;
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
            return;//!!!!
        }
        for (int i = 0; i < n; i++) {
            if (v[i]) continue;
            if (k > 0 && !primer(a[k - 1] + i + 1)) continue;
            v[i] = true;
            a[k] = i + 1;//把i这个没有用过的数放在数组的第k个位置
            dfs(k + 1);//进行k+1搜索
            v[i] = false;//k+1层搜索结束，重置v[i]为false 以便下一轮可以用
        }
    }

    private static boolean primer(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}