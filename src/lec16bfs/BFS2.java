package lec16bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS2 {
    // 效率高:可以解决可达性（最短路） ，连通度计算，最大区域

    static int n = 4;
    static char[][] g = new char[][]{
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
    };


    static void bfs(Pos start) {
        Queue<Pos> Q = new LinkedList<>();
        Set<Pos> H = new HashSet<>();
        Q.offer(start);
        H.add(start);
        while (!Q.isEmpty()) {
            Pos h = Q.peek();
            System.err.print(g[h.x][h.y]);
            Q.poll();
            H.add(h);
            for (int i = 0; i < next.length; i++) {
                int nx = h.x + next[i][0];
                int ny = h.y + next[i][1];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                Pos p = new Pos(nx, ny);
                if (H.contains(p)) continue;
                Q.offer(p);
                H.add(p);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new Pos(3, 4).equals(new Pos(3, 4)));
        bfs(new Pos(0, 0));

    }

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
    //static int[][] next = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0},{-1, 1}};// 八连通

    static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
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
