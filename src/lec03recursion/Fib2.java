package lec03recursion;

public class Fib2 {
    static int F[] = new int[100];

    static int f(int n) {//O(n);T(n)=T(n-1)+1
        if (F[n] != 0) return F[n];
        if (n == 1 || n == 2) return F[n] = 1;
        return F[n] = f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(f(60));
    }
}
