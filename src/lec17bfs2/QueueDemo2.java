package lec17bfs2;

import java.util.LinkedList;
import java.util.Queue;



public class QueueDemo2 {

    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        for(int i=0;i<10;i++){
           Q.offer(i);
        }
        while(!Q.isEmpty()){
            System.out.print(Q.peek());
            Q.poll();
        }
    }

}
