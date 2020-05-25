package lec15dfs;

public class App1b {
    static int n = 130;
    static int N = 10;
    static int[] a = new int[N];//a[1]=1!
    static int[] vis = new int[N];
    static  boolean flag=false;
    static {
        a[1] = 1;
        for (int i = 2; i < N; i++) {
            a[i] = a[i - 1] * i;
        }
    }

    static void dfs(int k) {
        if(flag)return ;
        if (k == N) {//访问完叶子节点
            int s = 0;
            for (int i = 1; i <= N - 1; i++) {
                if (vis[i] == 1)
                    s += a[i];
            }
            if (s == n) {
             flag=true;

            }

            return;
        }
        //处于根或者枝干节点
        vis[k] = 0;
        dfs(k + 1);
        vis[k] = 1;
        dfs(k + 1);
    }

    public static void main(String[] args) {
        dfs(1);
        System.out.println(flag);
    }

}
