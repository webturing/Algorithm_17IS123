package contest1516;

import java.util.*;

public class L {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int cas = cin.nextInt(); cas > 0; --cas) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            List<Point> pts = new Vector<Point>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = cin.nextInt();
                    if (x > 0) {
                        pts.add(new Point(i, j));
                    }

                }
            }
            Map<Point, Boolean> v = new HashMap<Point, Boolean>();
            int gmax = 0;
            for (Point p : pts) {
                if (v.get(p) != null) {
                    continue;
                }
                Queue<Point> Q = new LinkedList<Point>();
                Q.offer(p);
                int tot=0;


                while (!Q.isEmpty()) {
                    Point h = Q.peek();
                    v.put(h, true);
                    Q.poll();
                    ++tot;
                    for (int i = 0; i < nxt.length; i++) {
                        int dx = nxt[i][0];
                        int dy = nxt[i][1];
                        Point q = new Point(dx + h.x, dy + h.y);
                        if (pts.contains(q) && v.get(q) ==null) {
                            Q.offer(q);
                            v.put(q, true);
                        }
                    }

                }
                if(tot>gmax)gmax=tot;
            }
            System.out.println(gmax);

        }
    }

    static int[][] nxt = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    static class Point {
        int x, y,z=0;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Point == false)
                return false;
            Point that = (Point) obj;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            return x * 100000 + y;
        }

        @Override
        public String toString() {
            return String.format("(%d，%d)", x, y);
        }
    }
}