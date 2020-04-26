package lec06api;

public class SymmetricNumberGuess {
    public static void main(String[] args) {
        // unitTest();
        int n = 196;
        while (true) {
            int m = r(n);
            if (m == n) break;
            //n=n+m
            System.out.println(String.format("%d+%d=%d", n, m, n + m));
            n = n + m;
        }
    }


    //计算一个整数的翻转数
    private static int r(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }

    //判断一个数是否是对称数
    private static boolean ok(int m) {
        return m == r(m);
    }


    private static void unitTest() {
        int n = 12321;
        int m = r(n);
        System.out.println(m);
        boolean flag = ok(m);
        System.out.println(flag);
    }

}
