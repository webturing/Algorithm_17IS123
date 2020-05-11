package lec08ds2;

import java.util.LinkedList;

public class MagicGame2 {
    public static void main(String[] args) {
        LinkedList<Integer> Q = new LinkedList<Integer>();
        int n=13;
        for(int i=n;i>=1;i--){
            if(Q.size()>0){
                int x=Q.getLast();
                Q.pollLast();
                Q.addFirst(x);
            }
            Q.addFirst(i);
        }
        System.out.println(Q);
    }
}
