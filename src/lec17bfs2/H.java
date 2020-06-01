package lec17bfs2;

import java.util.*;

public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            List<Pos> pts = new Vector<Pos>();
            int k = 0;
            //"................";

            for (int i = 0; i <= m + 1; i++) {
                pts.add(new Pos(0, i));
                k++;
            }
            for (int x = 1; x <= n; x++) {
                String line = "." + cin.next() + ".";
                System.err.println(line);
                for (int y = 0; y <= m + 1; y++) {
                    if (line.charAt(y) == '.') {
                        pts.add(new Pos(x, y));
                        k++;
                    }
                }
            }
            for (int i = 0; i <= m + 1; i++) {
                pts.add(new Pos(n + 1, i));
                k++;
            }
            Map<Pos, Boolean> V = new HashMap<Pos, Boolean>();
            for (Pos pt : pts) V.put(pt, false);
            System.err.println(pts);

            Queue<Pos> Q = new LinkedList<>();
            Q.offer(new Pos(0, 0));
            int tot = 0;
            while (!Q.isEmpty()) {
                Pos p = Q.peek();
                int x = p.x;
                int y = p.y;
                V.put(p, true);
                Q.poll();
                ++tot;
                for (int i = 0; i < next.length; i++) {
                    int nx = x + next[i][0];
                    int ny = y + next[i][1];
                    Pos np = new Pos(nx, ny);
                    if (V.containsKey(np) && !V.get(np)) {//O(1)
                        Q.offer(np);
                        V.put(np, true);
                    }
                }
            }
            if (tot == k) {
                System.out.println("H");
            } else {
                System.out.println("A");
            }


        }
    }

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//四联通

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

        @Override
        public String toString() {
            return String.format("(%d,%d)", x, y);
        }
    }
}
