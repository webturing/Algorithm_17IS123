package lec04divideconque;

public class Step01 {
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
            for (int b = a; b <= N; b++)
                for (int c = b; c <= N; c++)
                    for (int d = c; d <= N; d++)
                        for (int e = d; e <= N; e++)
                            for (int f = e + 1; f <= N; f++) {
                                if (h(a) + h(b) + h(c) + h(d) + h(e) == h(f))
                                    System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                            }

    }
}
