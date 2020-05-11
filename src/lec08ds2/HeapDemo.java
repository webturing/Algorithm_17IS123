package lec08ds2;

import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,3,5,7,9,2,4,6,8,0};
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:arr)p.add(i);
        while(!p.isEmpty()){
            System.out.print(p.peek());
            p.poll();
        }

    }
}
