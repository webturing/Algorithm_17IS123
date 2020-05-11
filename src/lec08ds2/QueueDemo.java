package lec08ds2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            Q.offer(i);//进队
        }
        while (!Q.isEmpty()) {
            System.out.print(Q.peek());//front 队首元素
            Q.poll();//出队
        }
    }
}
