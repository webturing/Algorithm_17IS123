package lec02sorting;

import java.util.Scanner;

public class MainSqrt {
    public static void main(String[] args) {//O(sqrt(N))
        Scanner cin = new Scanner(System.in);
        int n = 100000005;
        int m = 2 * n;//待分解的整数

        for (int x = 1; x * x <= m; x++) {
            if (m % x != 0) continue;
            int y = m / x;
            if ((x + y) % 2 == 0) continue;
            //p+q==y   q-p+1==x;
            int q = (x + y - 1) / 2;
            int p = (y - x + 1) / 2;

            System.out.println(p + " " + q);
        }
    }
}
