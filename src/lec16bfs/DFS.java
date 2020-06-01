package lec16bfs;

public class DFS {

    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', '/', 'D'},
            {'E', 'F', '/', '/'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
    };
    static int[][] vis = new int[n][n];

    static void dfs(int x, int y) {
        vis[x][y] = 1;
        System.out.print(g[x][y]);
        if (y + 1 < n && vis[x][y + 1] == 0&&g[x][y+1]!='/') dfs(x, y + 1);//右 (0,1)
        if (x + 1 < n && vis[x + 1][y] == 0&&g[x+1][y]!='/') dfs(x + 1, y);//下(1,0)
        if (y - 1 >= 0 && vis[x][y - 1] == 0&&g[x][y-1]!='/') dfs(x, y - 1);//左(0,-1)
        if (x - 1 >= n && vis[x - 1][y] == 0&&g[x-1][y]!='/') dfs(x - 1, y);//上(-1,0)
    }

    public static void main(String[] args) {
        dfs(0, 0);//可以解决迷宫可达性 ，连通度个数，最大区域，速度较慢，不能计算最短路径
    }
}
