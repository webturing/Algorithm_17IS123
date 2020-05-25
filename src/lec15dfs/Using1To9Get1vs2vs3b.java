package lec15dfs;

public class Using1To9Get1vs2vs3b {
    final static int N = 9;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static boolean ok() {
        int x = a[0] * 100 + a[1] * 10 + a[2];
        int y = a[3] * 100 + a[4] * 10 + a[5];
        int z = a[6] * 100 + a[7] * 10 + a[8];
        return y == 2 * x && z == 3 * x;
    }

    static void dfs(int k) {
        if (k == N && ok()) {
            int x = a[0] * 100 + a[1] * 10 + a[2];
            int y = a[3] * 100 + a[4] * 10 + a[5];
            int z = a[6] * 100 + a[7] * 10 + a[8];
            System.out.println(String.format("%d %d %d", x, y, z));
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i + 1;
                dfs(k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
