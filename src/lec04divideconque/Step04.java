package lec04divideconque;

import java.util.Arrays;

public class Step04 {
    public static final int N = 100;
    public static long[] H = new long[N + 1];

    public static long h(int x) {
        return 1L * x * x * x * x * x;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static void solve() {//O(n^5*logN)
        for (int i = 1; i <= N; i++)
            H[i] = 1L * i * i * i * i * i;
        for (int a = 1; a <= N; a++)
            for (int b = a; b <= N; b++)
                for (int c = b; c <= N; c++)
                    for (int d = c; d <= N; d++)
                        for (int e = d; e <= N; e++) {
                            long key = H[a] + H[b] + H[c] + H[d] + H[e];
                            int f = Arrays.binarySearch(H, e, N, key);
                            if (f >= 0)
                                System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                        }

    }
}
