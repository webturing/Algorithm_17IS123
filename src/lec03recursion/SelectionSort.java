package lec03recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    //T(n)=n+T(n-1) T(1)=1
    //=>T(n)=n*(n+1)/2=O(n^2)
    static void sort(int[] a, int p, int q) {
        if (p == q) return;
        int k = p;
        for (int i = p + 1; i <= q; i++) {
            if (a[i] < a[k]) k = i;
        }
        if (k != p) {
            int t = a[p];
            a[p] = a[k];
            a[k] = t;
        }
        sort(a, p + 1, q);//T(n-1)
    }

}
