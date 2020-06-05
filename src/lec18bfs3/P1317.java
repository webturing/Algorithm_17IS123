package lec18bfs3;

import java.util.Scanner;

public class P1317 {
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
//合并x,y所在的两个树
    private static void union(int x, int y) {

        int fy = find(y);//找到y所在树根
        int fx = find(x);//找到x所在树根
        if (fx == fy) {
            return;
        }
        f[fy] = fx;
    }

    //找到x的根
    private static int find(int x) {
        if (x == f[x]) return x;
        return f[x] = find(f[x]);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        init();
        int m = cin.nextInt();
        while (m-- > 0) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            union(x, y);
        }
        System.out.println(count());


    }
}
