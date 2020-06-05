package lec18bfs3;

import java.util.Arrays;

public class DisjointSet {
    static int n = 5;
    static int[] f = new int[n + 1];//1,....n,

    static void init() {
        f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = i;//i是所在树的树根
        }
    }

    static int count() {//统计等价类的个数
        int tot = 0;
        for (int i = 1; i <= n; i++) {
            if (f[i] == i) {//是所在树的树根
                ++tot;
            }
        }
        return tot;
    }

    private static void union(int x, int y) {//并
        int fy = find(y);//找到y所在树根
        int fx = find(x);//找到x所在树根
        if (fx == fy) {
            return;
        }
        f[fy] = fx;
    }

    //找到x的根
    private static int find(int x) {//查
        if (x == f[x]) return x;
        return f[x] = find(f[x]);
    }

    public static void main(String[] args) {
        init();
        System.out.println(count());
        System.err.println(Arrays.toString(f));
        union(1, 2);
        System.out.println(count());
        System.err.println(Arrays.toString(f));
        union(2, 3);
        System.out.println(count());
        System.err.println(Arrays.toString(f));
        union(4, 5);
        System.out.println(count());
        System.err.println(Arrays.toString(f));

    }
}
