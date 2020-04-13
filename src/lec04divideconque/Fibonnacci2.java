package lec04divideconque;

import java.util.Arrays;

public class Fibonnacci2 {
    static int f(int n) {
        if (n <= 1) return n;
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        int f[] = new int[51];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++)
            f[i] = f[i - 1] + f[i - 2];
        System.out.println(Arrays.toString(f));
    }
}
