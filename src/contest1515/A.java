package contest1515;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long[] f = new long[1000000 + 1];
        f[1] = 1;
        f[2] = 2;//2=2 2=1+1
        f[3] = 4;//3 2+1 1+2 1+1+1
        for (int i = 4; i <= 1000000; i++) {
            f[i] = (f[i - 3] + f[i - 2] + f[i - 1]) % 998244353;
        }
        int T=cin.nextInt();
        while(T-->0) {
            int n = cin.nextInt();

            System.out.println(f[n]);
        }
        cin.close();
    }
}
