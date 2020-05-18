package lec02sorting;

public class Sqrt {
    public static void main(String[] args) {
        int n = 1000000005;
        long start = System.currentTimeMillis();
        solve(n);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    static void solve(int n) {//O(sqrt(n))
        int m = 2 * n;
        for (int p = (int) Math.sqrt(m); p >= 1; p--) {
            if (m % p != 0) continue;
            int q = m / p;
            int i = (q - p + 1) / 2;
            int j = (p + q - 1) / 2;
            if (i + j == q && j - i + 1 == p && i != j) {
                System.out.println(String.format("%d %d", i, j));
            }
        }
    }
}
