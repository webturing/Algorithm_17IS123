package lec16bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BfsApp4b {
    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', '/', 'D'},
            {'/', 'F', '/', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', '/'}
    };


    static int bfs(Pos start, Pos end) {
        Queue<Pos> Q = new LinkedList<>();
        Set<Pos> H = new HashSet<>();
        Q.offer(start);
        start.pre = null;
        H.add(start);
        start.depth = 0;
        while (!Q.isEmpty()) {
            Pos h = Q.peek();
            //System.err.print(g[h.x][h.y]);
            Q.poll();
            H.add(h);
            for (int i = 0; i < next.length; i++) {
                int nx = h.x + next[i][0];
                int ny = h.y + next[i][1];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || g[nx][ny] == '/') continue;
                Pos p = new Pos(nx, ny);
                if (H.contains(p)) continue;
                p.depth = h.depth + 1;
                p.pre = h;
                Q.offer(p);
                H.add(p);
                if (p.equals(end)) {
                    end.pre = h;
                    return p.depth;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Pos start = new Pos(0, 0);
        start.depth = 0;
        Pos end = new Pos(0, 3);
        int k = bfs(start, end);
        System.out.println(k);

        for (Pos p = end; k-- > 0; p = p.pre) {
            System.out.print(g[p.x][p.y] + "<-");

        }
        System.out.print(g[start.x][start.y]);

    }

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
//static int[][] next = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0},{-1, 1}};// 八连通

    static class Pos {
        int x, y, depth;
        Pos pre;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
            depth = 0;
            pre = null;
        }

        @Override
        public String toString() {
            return String.format("(%d %d)", x, y);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Pos)) return false;
            Pos p = (Pos) obj;
            return this.x == p.x && this.y == p.y;
        }

        @Override
        public int hashCode() {
            return x * 10000 + y;
        }
    }

}