package lec04divideconque;

import java.util.Arrays;

public class Step03 {
    public static final int N = 100;
    public static long[] H = new long[N + 1];


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        solve();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    //第一个优化：设 1<=a<=b<=c<=d<=e<f<=100  => 3hour->7s
    //优化二：避免重复计算x^5,用空间换时间，用数组H来存储H[x]=x^5 =>2.7s
    //优化三:用二分查找来判断 check(a^5+b^5+c^5....+e^5)=>1.3s
    private static void solve() {//O(n^5*logN)
        for (int i = 1; i <= N; i++)
            H[i] = 1L * i * i * i * i * i;
        for (int a = 1; a <= N; a++)
            for (int b = a; b <= N; b++)
                for (int c = b; c <= N; c++)
                    for (int d = c; d <= N; d++)
                        for (int e = d; e <= N; e++) {
                            long key = H[a] + H[b] + H[c] + H[d] + H[e];
                            int f = Arrays.binarySearch(H, key);
                            if (f >= 0)
                                System.out.println(String.format("%d %d %d %d %d %d", a, b, c, d, e, f));
                        }

    }
}
