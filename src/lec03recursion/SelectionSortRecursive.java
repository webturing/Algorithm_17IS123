package lec03recursion;

import java.util.Arrays;


public class SelectionSortRecursive {
    static void sort(int arr[], int left, int right) {
        if (left >= right)
            return;
        int k = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < arr[k]) k = j;

        }
        if (k != left) {
            int temp = arr[left];
            arr[left] = arr[k];
            arr[k] = temp;
        }
        sort(arr, left + 1, right);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
