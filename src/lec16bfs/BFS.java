package lec16bfs;

public class BFS {
    // 效率高:可以解决可达性（最短路） ，连通度计算，最大区域

    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', '/', 'D'},
            {'E', 'F', '/', 'H'},
            {'I', 'J', '/', 'L'},
            {'M', '/', 'O', 'P'}
    };
    static int[][] vis = new int[n][n];
     static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
    //static int[][] next = new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 },
      //      { -1, 1 } };// 八连通
    static int[][] q = new int[10000][2];
    static int head = 0, tail = -1;//q[head,tail]队列的内容

    static void bfs(int sx, int sy) {
        ++tail;
        q[tail][0] = sx;
        q[tail][1] = sy;
        while (head <= tail) {
            int xx = q[head][0];
            int yy = q[head][1];
            System.out.print(g[xx][yy]);
            vis[xx][yy] = 1;
            ++head;
            for (int i = 0; i < next.length; i++) {
                int nx = xx + next[i][0];
                int ny = yy + next[i][1];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n || vis[nx][ny] == 1||g[nx][ny]=='/')
                    continue;
                ++tail;
                q[tail][0] = nx;
                q[tail][1] = ny;
                vis[nx][ny] = 1;
            }
        }
    }

    public static void main(String[] args) {
        bfs(0, 0);

    }

}
