package lec19graph;

public class TSPDemo {
    static int n = 4;
    static int dis[][] = new int[][]{
            {0, 30, 6, 4},
            {30, 0, 5, 10},
            {6, 5, 0, 20},
            {4, 10, 20, 0}
    };

    public static void main(String[] args) {
        int best = Integer.MAX_VALUE;
        String path="";
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    for (int d = 0; d < n; d++) {
                        if (a == b || a == c || a == d || b == c || b == d || c == d) continue;
                        int cost = dis[a][b] + dis[b][c] + dis[c][d] + dis[d][a];
                        if (cost < best) {
                            best = cost;
                            path=String.format("%d %d %d %d", a, b, c, d);
                        }

                    }
                }
            }
        }
        System.out.println(best);
        System.out.println(path);
    }
}
