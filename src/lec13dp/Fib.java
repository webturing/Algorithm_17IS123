package lec13dp;

public class Fib {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(f(46));
        long end = System.currentTimeMillis();
        System.out.println(String.format("%.3f", (end - start) / 1000.0));
    }

    private static int f(int n) {//O(a^n)  a=1.618
        if (n == 1 || n == 2) return 1;
        return f(n - 1) + f(n - 2);
    }
}
