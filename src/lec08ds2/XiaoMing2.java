package lec08ds2;

import java.util.PriorityQueue;

public class XiaoMing2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        //(1,2,3,4,5,6,7)=> (0,3,3,4,5,6,7)
        int n = a.length;
        int tot = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            Q.offer(a[i]);
        }
        while (Q.size() > 1) {
            int x = Q.peek();
            Q.poll();
            int y = Q.peek();
            Q.poll();
            tot += x + y;
            Q.offer(x + y);
        }
        System.out.println(tot);
    }
}
