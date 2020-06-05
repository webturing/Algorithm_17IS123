package lec18bfs3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', 'C', 'D'},
            {'/', 'F', '/', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', '/', 'O', 'P'}
    };

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
    // static int[][] next = new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };// 八连通

    public static void main(String[] args) {
        bfs(new Pos(0, 0), new Pos(0, 3));//A->...->P


    }

    private static void bfs(Pos start, Pos end) {
        Queue<Pos> Q = new LinkedList<>();
        Q.offer(start);
        start.depth = 0;//start->start=0
        start.pre = null;
        HashSet<Pos> V = new HashSet<>();

        while (!Q.isEmpty()) {
            Pos p = Q.peek();
            int x = p.x;
            int y = p.y;
            int depth = p.depth;
            System.out.println(p);
            V.add(p);
            if (p==end) {
                end.depth=p.depth;
                end.pre=p.pre;
                System.out.println(end.depth);
                break;
            }
            Q.poll();
            for (int i = 0; i < next.length; i++) {
                int nx = next[i][0] + x;
                int ny = next[i][1] + y;
                Pos np = new Pos(nx, ny);

                if (nx < 0 || ny < 0 || nx >= n || ny >= n || V.contains(np) || g[nx][ny] == '/') continue;

                Q.offer(np);
                np.depth = p.depth + 1;//层的扩张
                np.pre = p;//!!!!
                V.add(np);


            }
        }
        Pos pos = end;
        while (pos != null) {
            System.out.print(pos + "<-");
            pos = pos.pre;
        }

    }

    static class Pos {
        int x, y, depth;
        Pos pre;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
            depth = -1;

        }

        @Override
        public boolean equals(Object that) {
            if (that instanceof Pos) {
                Pos p = (Pos) that;
                return this.x == p.x && this.y == p.y;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return x + 10000 * y;
        }

        @Override
        public String toString() {
            return String.format("(%d %d)%s", this.x, this.y, g[x][y]);
        }
    }

}
