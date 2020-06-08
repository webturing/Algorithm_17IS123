package lec19graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TSPDemo2 {
    static int n = 4;
    static int dis[][] = new int[][]{
            {0, 30, 6, 4},
            {30, 0, 5, 10},
            {6, 5, 0, 20},
            {4, 10, 20, 0}
    };

    public static void main(String[] args) {
        int best = Integer.MAX_VALUE;
        String path = "";
        List<Integer> v = Arrays.asList(0, 1, 2, 3);
        int tot=0;
        while (++tot<3) {
            Collections.shuffle(v);
            System.out.println(v);
            int a = v.get(0), b = v.get(1), c = v.get(2), d = v.get(3);
            int cost = dis[a][b] + dis[b][c] + dis[c][d] + dis[d][a];
            if (cost < best) {
                best = cost;
                path = String.format("%d %d %d %d", a, b, c, d);

            }

        }
        System.out.println(best);
        System.out.println(path);
    }
}
