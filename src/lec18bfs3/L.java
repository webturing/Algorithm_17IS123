package lec18bfs3;

import java.util.*;

public class L {
    public static void main(String[] args) {
        System.out.println(new Pos(0,0)==new Pos(0,0));
        Scanner cin = new Scanner(System.in);
        Pos start = new Pos(0, 0), end = new Pos(0, 0);
        List<Pos> points = new Vector<>();
        int n = cin.nextInt();
        int m = cin.nextInt();
        for (int i = 0; i < n; i++) {
            String line = cin.next();

            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'S') {
                    start = new Pos(i, j);
                    points.add(start);
                    start.depth = 0;
                    continue;
                }
                if (line.charAt(j) == 'G') {
                    end = new Pos(i, j);
                    points.add(end);
                    end.depth = -1;
                    continue;
                }
                if (line.charAt(j) == '.') {
                    points.add(new Pos(i, j));

                }
            }
        }
        System.err.println(points.size());
        HashSet<Pos> V = new HashSet<>();
        for (Pos pt : points) V.add(pt);
        Queue<Pos> Q = new LinkedList<Pos>();
        Q.offer(start);
        int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通
        start.depth = 0;
        V.add(start);
        while (!Q.isEmpty()) {
            Pos p = Q.peek();
            V.add(p);
            System.err.println(p);
            if (p==end) {
                end.depth=p.depth;
                ///end.pre=p.pre;
                System.out.println(end.depth);
                break;
            }
            Q.poll();
            for (int i = 0; i < next.length; i++) {
                int nx = p.x + next[i][0];
                int ny = p.y + next[i][1];
                Pos np = new Pos(nx, ny);
                if (!V.contains(np)&&points.contains(np)) {
                    Q.offer(np);
                    np.depth = p.depth + 1;//!!!!
                    V.add(np);
                }
            }

        }
    }


    static class Pos {
        int x, y, depth;

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


    }
}
