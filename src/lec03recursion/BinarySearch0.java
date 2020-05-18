package lec03recursion;

import java.util.Arrays;

public class BinarySearch0 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Arrays.sort(a);
        int k = 7;
        int pos = find(a, k, 3, 8);

        System.out.println(pos);
        System.out.println(Arrays.binarySearch(a, k));

    }

    //binary search k in A[p:q]
    private static int find(int[] a, int k, int p, int q) {

        while (p <= q) {
            int mid = (p + q) / 2;
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] > k) {
                q = mid - 1;
            } else {
                p = mid + 1;
            }
        }
        return -1;
    }
}
