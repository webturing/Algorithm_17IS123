package lec04divideconque;

public class Fibonacci {
    static int f(int n) {
        if (n <= 1) return n;
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long start = System.currentTimeMillis();
            f(i);
            long end = System.currentTimeMillis();
            System.out.println(String.format("%d %d", i, end - start));
        }
    }
}
