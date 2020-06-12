package contest1516;

import java.util.Scanner;

public class C {
    static int n = 10;
    static int[] a = new int[n + 1];

    static boolean dfs(int k, int t) {
        if (t == 0) return true;
        if (k >= n) return t == 0;
        return dfs(k + 1, t - a[k]) || dfs(k + 1, t);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (; cin.hasNext(); ) {
            n = cin.nextInt();
            a = new int[n + 1];
            int t = 0;
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
                t += a[i];
            }
            if (t % 2 == 0 && dfs(0, t >> 1)) {
                System.out.println("Of course,I can!");
            } else {
                System.out.println("Sorry,I can't!");
            }
        }
    }
}