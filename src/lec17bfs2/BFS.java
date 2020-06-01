package lec17bfs2;

public class BFS {
    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', 'C', 'D'},
            {'/', 'F', '/', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', '/', 'O', 'P'}
    };
    static int[][] vis = new int[n][n];
   static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
   // static int[][] next = new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };// 八连通
    static int[][] q = new int[10000][2];
    static int head = 0, tail = -1;//q[head,tail]队列的内容

    public static void main(String[] args) {
        bfs(0, 0);

    }

    private static void bfs(int sx, int sy) {
        head = 0;
        tail = -1;
        ++tail;
        q[tail][0] = sx;
        q[tail][1] = sy;
        while (head <= tail) {
            int x = q[head][0];
            int y = q[head][1];
            System.err.print(g[x][y] + " ");
            ++head;
            vis[x][y] = 1;//标记
            for (int i = 0; i < next.length; i++) {
                int dx = next[i][0];
                int dy = next[i][1];
                int nx = x + dx;
                int ny = y + dy;
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || vis[nx][ny] == 1||g[nx][ny]=='/') continue;
                ++tail;
                q[tail][0] = nx;
                q[tail][1] = ny;
                vis[nx][ny] = 1;
            }

        }
    }

}
