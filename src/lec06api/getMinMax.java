package lec06api;

import java.util.Arrays;

public class getMinMax {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int min = getMin(a);//O(n-1)
        int max = getMax(a);//O(n-1)
        System.out.println("min=" + min + ",max=" + max);//O(2*n-2)
        int[] res = getMinAndMax(a);
        System.out.println("min=" + res[0] + ",max=" + res[1]);//O(3*n/2-2)
        Arrays.sort(a);//O(nLogN)
        System.out.println("min=" + a[0] + ",max=" + a[a.length - 1]);//O(nlogn)

    }

    private static int[] getMinAndMax(int[] a) {
        int min, max, n = a.length;
        min = max = a[0];
        for (int i = 0; i + 1 < n; i += 2) {
            if (a[i] > a[i + 1]) {
                if (a[i] > max) max = a[i];
                if (a[i + 1] < min) min = a[i + 1];
            } else {
                if (a[i] < min) min = a[i];
                if (a[i + 1] > max) max = a[i + 1];
            }
        }
        if (n % 2 == 1) {
            if (a[n - 1] > max) max = a[n - 1];
            if (a[n - 1] < min) min = a[n - 1];
        }
        return new int[]{min, max};

    }

    private static int getMax(int[] a) {
        int t = a[0], n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i] > t) {
                t = a[i];
            }
        }
        return t;
    }

    private static int getMin(int[] a) {
        int t = a[0], n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i] < t) {
                t = a[i];
            }
        }
        return t;
    }
}
