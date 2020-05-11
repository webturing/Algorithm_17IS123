package lec08ds2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DecodeQQNumber {
    public static void main(String[] args) {
        int n = cin.nextInt();
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(cin.nextInt());
        }
        while (!Q.isEmpty()) {
            int front = Q.peek();
            System.out.print(front + " ");
            Q.poll();
            if (Q.isEmpty()) break;
            front = Q.peek();
            Q.poll();
            Q.offer(front);

        }
    }

    static Scanner cin = new Scanner(System.in);
}
