package lec03recursion;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {

        int[] arr = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 堆排序
    public static void heapSort(int[] arr) {
        int length = arr.length;
        // 此循环为了初始化堆
        for (int i = (length - 1) / 2; i >= 0; i--) {
            heapAdjust(arr, i, length);
            System.out.println(Arrays.toString(arr));
        }
        for (int i = length - 1; i >= 0; i--) {
            // 交换堆顶元素H[0]和堆中最后一个元素
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            // 每次交换堆顶元素和堆中最后一个元素之后，都要对堆进行调整
            heapAdjust(arr, 0, i);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void heapAdjust(int[] arr, int i, int length) {
        int temp = arr[i]; // 待调整位置结点
        int child = 2 * i + 1; // 左孩子结点的位置
        while (child < length) {
            if (child + 1 < length && arr[child + 1] > arr[child]) { // 如果右孩子比左孩子大
                child++; // 右孩子结点位置
            }
            if (arr[i] < arr[child]) { // 如果待调整位置结点小于孩子结点中最大的
                arr[i] = arr[child]; // 将孩子结点上移代替父结点
                i = child; // 新的待调整结点位置
                child = 2 * i + 1; // 新的左孩子结点位置
            } else {
                break; // 反之不需要调整
            }
            arr[i] = temp; // 将待调整结点的值给新的待调整结点
        }
    }

}
