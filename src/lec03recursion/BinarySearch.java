package lec03recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Arrays.sort(a);
        int k = 7;
        int pos = find(a, k, 0, a.length - 1);

        System.out.println(pos);

    }

    //binary search k in A[p:q]
    //T(n)=1+T(n/2) T(1)=1
    //=> T(n)=log N

    private static int find(int[] a, int k, int p, int q) {
        if (p == q) return a[p] == k ? p : -1;
        int mid = (p + q) / 2;
        if (k == a[mid])
            return mid;
        if (k > a[mid])
            return find(a, k, mid + 1, q);
        else
            return find(a, k, p, mid - 1);

    }
}
