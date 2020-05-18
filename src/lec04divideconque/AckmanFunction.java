package lec04divideconque;

public class AckmanFunction {
    public static void main(String[] args) {
        System.out.println(A(0, 0));
        System.out.println(A(0, 1));
        System.out.println(A(1, 0));
        System.out.println(A(1, 2));
        System.out.println(A(2, 1));
        System.out.println(A(2, 2));
        System.out.println(A(2, 3));
        System.out.println(A(3, 3));
        System.out.println(A(4, 3));
    }

    static int A(int n, int m) {
        if (n == 1 && m == 0) return 2;
        if (n == 0) return 1;
        if (m == 0) return n + 2;
        return A(A(n - 1, m), m - 1);
    }
}
