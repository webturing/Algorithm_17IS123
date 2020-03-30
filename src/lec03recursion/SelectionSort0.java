package lec03recursion;

import java.util.Arrays;


public class SelectionSort0 {
    static void sort(int arr[], int left, int right) {
        for (int i = left; i <= right; i++) {
            int k = i;
            for (int j = i + 1; j <= right; j++) {
                if (arr[j] < arr[k]) k = j;

            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
