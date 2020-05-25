package lec16bfs;

import java.util.*;

public class BfsDemo {
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] G = new char[][] { { 'A', 'B', 'C', 'D' }, { 'E', 'F', 'G', 'H' }, { 'I', 'J', 'K', 'L' },
                { 'M', 'N', 'O', 'P' },

        };
        boolean[][] vis = new boolean[n][n];
        Node start = new Node(0, 0);
        Queue<Node> Q = new LinkedList<Node>();
        Q.offer(start);
        vis[start.x][start.y] = true;
        while (!Q.isEmpty()) {
            Node head = Q.peek();
            Q.poll();
            int x = head.x;
            int y = head.y;
            if (y + 1 < n && !vis[x][y + 1])
                Q.offer(new Node(x, y + 1));

            if (x + 1 < n && !vis[x + 1][y])
                Q.offer(new Node(x + 1, y));
            if (y - 1 >= 0 && !vis[x][y - 1])
                Q.offer(new Node(x + 1, y));
            if (x + 1 < n && !vis[x + 1][y])
                Q.offer(new Node(x + 1, y));

            ;
        }

    }
}