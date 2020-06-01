package lec17bfs2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS2 {
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
        bfs(new Pos(0,0));
        HashSet<Pos> h = new HashSet<>();
        h.add(new Pos(0, 0));
        h.add(new Pos(0, 0));
        System.out.println(h.size());

    }

    private static void bfs(Pos start) {
        Queue<Pos> Q = new LinkedList<>();
        Q.offer(start);
        HashSet<Pos> V = new HashSet<>();
        while (!Q.isEmpty()) {
            Pos p = Q.peek();
            int x = p.x;
            int y = p.y;
            System.err.print(g[x][y]);
            Q.poll();
            for (int i = 0; i < next.length; i++) {
                int nx = next[i][0] + x;
                int ny = next[i][1] + y;
                Pos np = new Pos(nx, ny);
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || V.contains(np)||g[nx][ny]=='/') continue;
                Q.offer(np);
                V.add(np);

            }
        }


    }

    static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
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
    }

}
