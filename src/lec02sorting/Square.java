package lec02sorting;

public class Square {
    public static void main(String[] args) {
        int n = 100005;
        long start = System.currentTimeMillis();
        solve(n);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    static void solve(int n) {//O(n^2/2)
        for (int p = 1; p <= n; p++) {
            for (int q = p + 1; q <= n; q++) {
                int s = (p + q) * (q - p + 1) / 2;
                if (s == n) {
                    System.out.println(String.format("%d %d", p, q));
                }
            }
        }
    }
}
