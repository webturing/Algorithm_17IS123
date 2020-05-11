package lec08ds2;


import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        int n = 1023;
        int r = 7;
        Stack<Integer> S = new Stack<>();
        do {
            // System.out.print(n % r);
            S.push(n % r);
            n = n / r;

        } while (n > 0);

        while (!S.isEmpty()) {
            System.out.print(S.peek());
            S.pop();
        }

    }
}
