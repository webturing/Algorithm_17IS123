package lec08ds2;

import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        PriorityQueue<Integer> Q = new PriorityQueue<>();//一个空的小顶堆
        for (Integer i : arr) {
            Q.offer(i);
        }
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());//堆顶元素，最小值

            Q.poll();// 堆顶元素删除
        }

    }
}
