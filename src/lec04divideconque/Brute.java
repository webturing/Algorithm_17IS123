package lec04divideconque;

public class Brute {
    public static final int N = 100;

    public static long h(int x) {
        return 1L * x * x * x * x * x;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    private static void solve() {//O(n^6)
        for (int a = 1; a <= N; a++)
            for (int b = 1; b <= N; b++)
                for (int c = 1; c <= N; c++)
                    for (int d = 1; d <= N; d++)
                        for (int e = 1; e <= N; e++)
                            for (int f = 1; f <= N; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f))
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                            }

    }
}
