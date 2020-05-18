package lec02sorting;

import java.util.Arrays;

public class NlogN {
    public static void main(String[] args) {
        int n = 100005;
        long start = System.currentTimeMillis();
        solve(n);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    static void solve(int n) {//O(nlogn)
        int[] a = new int[n + 1];
        for (int i = 0; i < a.length; i++) a[i] = i;
        int[] s = new int[n + 1];
        for (int i = 1; i < s.length; i++) s[i] = s[i - 1] + a[i];
        // System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            int x = s[i];
            int y = x + n;
            int j = Arrays.binarySearch(s, y);
            if (j < 0 || i + 1 == j) continue;
            System.out.println(String.format("%d %d", i + 1, j));

        }
    }
}
