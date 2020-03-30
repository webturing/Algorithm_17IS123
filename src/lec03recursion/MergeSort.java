package lec03recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(a));
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a, int p, int q) {
        if (p == q) return;
        int mid = (p + q) / 2;
        sort(a, p, mid);
        sort(a, mid + 1, q);
        merge(a, p, mid, q);
    }

    private static void merge(int[] a, int p, int mid, int q) {
        int[] b = new int[q - p + 1];
        int left = p;
        int right = mid + 1;
        for (int i = 0; i < b.length; i++) {
            if (right == q + 1) {
                b[i] = a[left++];
                continue;
            }
            if (left == mid + 1) {
                b[i] = a[right++];
                continue;
            }
            if (a[left] <= a[right]) {
                b[i] = a[left++];
            } else {
                b[i] = a[right++];
            }
        }
        System.arraycopy(b, 0, a, p, b.length);
    }
}
