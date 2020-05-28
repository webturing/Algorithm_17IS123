package lec16bfs;

import java.util.Scanner;

public class BfsApp3 {

    public static void main(String[] args) {

        int N = cin.nextInt();//地图的行数
        int M = cin.nextInt();//地图的列
        int[][] g = new int[N][M];//地图，有时候需要加圈 g=new int[N+2][M+2]
        int[][] vis = new int[N][M];

        for (int i = 0; i < N; i++) for (int j = 0; j < M; j++) g[i][j] = cin.nextInt();
        int gmax = 0;

        while (true) {
            int sx = 0, sy = 0;
            boolean done = true;

            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++) {
                    if (vis[i][j] == 0 && g[i][j] > 0) {
                        sx = i;
                        sy = j;
                        done = false;
                        // break;
                    }

                }
            if (done) {
                break;
            }
            head = 0;
            tail = -1;//初始化队列
            ++tail;
            Q[tail][0] = sx;
            Q[tail][1] = sy;
            ++gmax;
            while (head <= tail) {
                int x = Q[head][0], y = Q[head][1];
                vis[x][y] = 1;
                ++head;
                System.err.printf("(%d,%d)", x, y);

                for (int i = 0; i < 4; i++) {
                    int nx = x + adj[i][0], ny = y + adj[i][1];
                    if (nx < 0 || nx >= N || ny < 0 || ny >= M || g[nx][ny] == 0 || vis[nx][ny] == 1) continue;
                    ++tail;
                    Q[tail][0] = nx;
                    Q[tail][1] = ny;
                    vis[nx][ny] = 1;
                }

            }
            System.err.println("");
        }
        System.out.println(gmax);
    }


    static Scanner cin = new Scanner(System.in);
    static int[][] adj = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
    static int[][] Q = new int[2000000][2];//队列 一般需要是有效节点数的两倍容量
    static int head = 0, tail = -1;//队列头尾 维护Q[head,tail]这个闭区间
}
/*
BFS求岛屿个数
测试输入
10 10
1 2 1 0 0 0 0 0 2 3
3 0 2 0 1 2 1 0 1 2
4 0 1 0 1 2 3 2 0 1
3 2 0 0 0 1 2 4 0 0
0 0 0 0 0 0 1 5 3 0
0 1 2 1 0 1 5 4 3 0
0 1 2 3 1 3 6 2 1 0
0 0 3 4 8 9 7 5 0 0
0 0 0 3 7 8 6 0 1 2
0 0 0 0 0 0 0 0 1 0
测试输出:
4
*/