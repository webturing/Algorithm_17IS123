package contest1515;//package lec01sorting;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        //int n = 2000000;
        long start = System.currentTimeMillis();
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) a[i] = i;
        //System.err.println(Arrays.toString(a));
        long[] b = new long[n + 1];
        b[0] = a[0];
        for (int i = 1; i <= n; i++) b[i] = b[i - 1] + a[i];
        //System.err.println(Arrays.toString(b));

        for (int p = 0; p <= n; p++) {//O(NlogN)
            long x = b[p];
            long y = n + x;
            int q = Arrays.binarySearch(b, y);//log(N)二分查找
            if (q > p + 1) {
                System.out.println(p + 1 + " " + q);
            }
        }


        long end = System.currentTimeMillis();
        System.err.println((end - start) / 1000.0 + " Second(s).");
    }
}
