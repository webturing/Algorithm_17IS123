package lec16bfs;

import java.util.Scanner;

public class BfsApp4 {

    public static void main(String[] args) {

        int N = cin.nextInt();//地图的行数
        int M = cin.nextInt();//地图的列
        int[][] g = new int[N][M];//地图，有时候需要加圈 g=new int[N+2][M+2]
        int[][] vis = new int[N][M];
        int sx = cin.nextInt(), sy = cin.nextInt();
        int ex = cin.nextInt(), ey = cin.nextInt();
        for (int i = 0; i < N; i++) for (int j = 0; j < M; j++) g[i][j] = cin.nextInt();




        head = 0;
        tail = -1;//初始化队列
        ++tail;
        Q[tail][0] = sx;
        Q[tail][1] = sy;
        Q[tail][2] = 0;//表示(sx,sy)到自己0步可达
        boolean find = false;
        while (head <= tail) {
            int x = Q[head][0], y = Q[head][1], z = Q[head][2];
            ++head;
            vis[x][y] = 1;
            if (x == ex && y == ey) {
                System.out.println(z);
                find = true;
                break;
            }

            System.err.printf("(%d,%d)", x, y);

            for (int i = 0; i < 4; i++) {
                int nx = x + adj[i][0], ny = y + adj[i][1];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || g[nx][ny] == 0 || vis[nx][ny] == 1) continue;
                ++tail;
                Q[tail][0] = nx;
                Q[tail][1] = ny;
                Q[tail][2] = z + 1;//关键 因为这个是（x,y)扩展的点，所以深度为z+1
                vis[nx][ny] = 1;
            }

        }
        if (!find) {
            System.out.println(-1);
        }
    }


    static Scanner cin = new Scanner(System.in);
    static int[][] adj = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
    static int[][] Q = new int[2000000][3];//队列 一般需要是有效节点数的两倍容量
    static int head = 0, tail = -1;//队列头尾 维护Q[head,tail]这个闭区间
}
/*
BFS求最短路径
测试输入
10 10  0 0 9 8
1 2 1 1 1 0 0 0 2 3
3 0 2 0 1 2 1 0 1 2
4 0 1 0 1 2 3 2 0 1
3 2 0 0 0 1 2 4 0 0
0 0 0 0 0 0 1 5 3 0----·
0 1 2 1 0 1 5 4 3 0
0 1 2 3 1 3 6 2 1 0
0 0 3 4 8 9 7 5 1 0
0 0 0 3 7 8 6 0 1 2
0 0 0 0 0 0 0 0 1 0
测试输出:
4
*/