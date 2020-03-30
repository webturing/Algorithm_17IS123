package lec03recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(a));
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right) return;
        int p = partition(a, left, right);
        sort(a, left, p - 1);
        sort(a, p + 1, right);
    }

    private static int partition(int[] a, int p, int q) {
        int i = p;
        for (int j = p; j <= q; j++) {
            if (a[j] < a[q]) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        }
        int t = a[q];
        a[q] = a[i];
        a[i] = t;
        return i;
    }
}
