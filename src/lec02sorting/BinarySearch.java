package lec02sorting;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int k = 7;
        //linear search
        boolean find = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                find = true;
                break;
            }
        }
        System.out.println(find);
        //二分查找算法
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, k) >= 0);
    }
}
