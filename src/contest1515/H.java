package contest1515;

import java.util.Scanner;

public class H {
    //f(n) 是长度为n 以0开头不含11的串
    //g(n)是长度为n 以1开头不含11的串
    //f(1)=g(1)=1
    //f(2)=2     g(2)=1

    //f(n+1)=f(n)+g(n)   g(n+1) =f(n)
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[][] f = new int[10000][2];
        f[1][0] = 1;
        f[1][1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i][0] = (f[i - 1][0] + f[i - 1][1]) % 1000000007;
            f[i][1] = f[i - 1][0];
        }
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println((f[n][0] + f[n][1]) % 100000007);

        }


    }
}
